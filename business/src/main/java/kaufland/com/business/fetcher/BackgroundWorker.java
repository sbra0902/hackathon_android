package kaufland.com.business.fetcher;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;

public abstract class BackgroundWorker<T> {
    private final String TAG = getClass().getName();
    private AsyncTask<Void, Void, T> mAsyncTask;

    private BackgroundWorkerCallback mCallBack;
    private Context mContext;
    private boolean mHasErrors;

    private boolean isRunning = false;

    public interface BackgroundWorkerCallback<DTO> {

        void onStartFetch();

        void onError(Exception e);

        void onResult(DTO result);
    }

    public void doWork(final BackgroundWorkerCallback callback, final Context context) {
        mCallBack = callback;
        mContext = context;
        mHasErrors = false;

        if (mAsyncTask != null) {
            mAsyncTask.cancel(true);
            mAsyncTask = null;
        }

        mAsyncTask = new AsyncTask<Void, Void, T>() {

            @Override
            protected void onPreExecute() {
                Log.d(TAG, "onPreExecute");
                super.onPreExecute();
                isRunning = true;
                callback.onStartFetch();
            }

            @Override
            protected void onPostExecute(T result) {
                // BackgroundWorker#doInBackground returns null, when an error happened.
                // onPostExecute doesn't react for this. it will call onResult()
                Log.d(TAG, "onPostExecute");
                isRunning = false;
                super.onPostExecute(result);
                if (!isCancelled() && !mHasErrors) {
                    callback.onResult(result);
                }
            }

            @Override
            protected T doInBackground(Void... params) {
                return BackgroundWorker.this.doInBackground(context);
            }
        }.execute();
    }

    public boolean isRunning() {
        return isRunning;
    }

    protected void onError(final Exception e) {
        mHasErrors = true;
        Handler mainHandler = new Handler(mContext.getMainLooper());
        mainHandler.post(new Runnable() {
            @Override
            public void run() {
                mCallBack.onError(e);
            }
        });
    }

    protected abstract T doInBackground(Context context);

    public AsyncTask.Status getStatus() {
        return mAsyncTask == null ? null : mAsyncTask.getStatus();
    }

    public void cancelRunningTask() {
        if (mAsyncTask != null && mAsyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            mAsyncTask.cancel(false);
        }
    }
}