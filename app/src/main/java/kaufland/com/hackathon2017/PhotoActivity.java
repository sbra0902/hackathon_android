package kaufland.com.hackathon2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

import com.google.android.cameraview.CameraView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_photo)
public class PhotoActivity extends AppCompatActivity {

    @ViewById(R.id.camera)
    protected CameraView mCameraView;

    @ViewById(R.id.btn_take_picture)
    protected CardView mTakePicture;

    @AfterViews
    public void init(){
        mCameraView.addCallback(new CameraView.Callback() {
            @Override
            public void onPictureTaken(CameraView cameraView, byte[] data) {
                super.onPictureTaken(cameraView, data);
                Intent intent = new Intent(PhotoActivity.this, MainActivity_.class);
                startActivity(intent);
                finish();
            }
        });
        mTakePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCameraView.takePicture();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCameraView.start();
    }

    @Override
    protected void onPause() {
        mCameraView.stop();
        super.onPause();
    }


}
