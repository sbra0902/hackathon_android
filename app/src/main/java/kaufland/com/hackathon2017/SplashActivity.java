package kaufland.com.hackathon2017;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by sbra0902 on 26.10.17.
 */
@EActivity(R.layout.splash_activity)
public class SplashActivity extends Activity {

    @ViewById(R.id.img_splash)
    protected ImageView mSplashImage;


    @AfterViews
    public void initAfterViews() {
        triggerInit();
    }

    @Background
    protected void triggerInit() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            Intent intent = new Intent(SplashActivity.this, PhotoActivity_.class);
            startActivity(intent);
            finish();
        }
    }
}
