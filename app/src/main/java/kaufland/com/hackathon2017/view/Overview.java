package kaufland.com.hackathon2017.view;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import kaufland.com.business.fetcher.BackgroundWorker;
import kaufland.com.business.fetcher.RecipeFetcher;
import kaufland.com.business.mocks.Mocks;
import kaufland.com.hackathon2017.R;

/**
 * Created by sbra0902 on 26.10.17.
 */
@EViewGroup(R.layout.overview_view)
public class Overview extends FrameLayout {


    @ViewById(R.id.recyclerview)
    protected RecyclerView mRecyclerView;

    @Bean
    protected OverviewViewAdapter mAdapter;

    @Bean
    protected Mocks mMocks;

    public Overview(@NonNull Context context) {
        super(context);
    }

    public Overview(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Overview(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Overview(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr, @StyleRes int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @AfterViews
    public void init(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
//        mRecyclerView.addItemDecoration(new SpacesItemDecoration((int) getResources().getDimension(R.dimen.offer_spacing), 1));
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.update(mMocks.getRecipies());

    }
}
