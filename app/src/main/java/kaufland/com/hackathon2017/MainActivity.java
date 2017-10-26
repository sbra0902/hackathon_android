package kaufland.com.hackathon2017;

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by sbra0902 on 26.10.17.
 */
@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

    @ViewById(R.id.toolbar)
    protected Toolbar mToolbar;

    @ViewById(R.id.title_fix)
    protected TextView mTitle;



    @AfterViews
    public void init(){

        mTitle.setText("Übersicht");
    }
}
