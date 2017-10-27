package kaufland.com.hackathon2017.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

import kaufland.com.business.model.RecipeSearchResultModel;
import kaufland.com.hackathon2017.R;

/**
 * Created by sbra0902 on 26.10.17.
 */
@EViewGroup(R.layout.recipe_view_item)
public class RecipeView extends LinearLayout{

    @ViewById(R.id.img_picture)
    protected ImageView mImageView;

    @ViewById(R.id.txt_title)
    protected TextView mTitle;

    @ViewById(R.id.txt_description)
    protected TextView mDescription;

    @ViewById(R.id.txt_rating)
    protected TextView mRating;

    public RecipeView(Context context) {
        super(context);
    }

    public RecipeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecipeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public RecipeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void bind(RecipeSearchResultModel model){

        mTitle.setText(model.getRecipeName());

        mDescription.setText(model.getCooking()[0]);

        mRating.setText(model.getMatchingPercentage() + "%");


//        mDescription.setText(model.getCooking()[0]);


        Glide.with(getContext())
                .load(model.getImageUrl())
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .placeholder(R.drawable.ic_kaufland_placeholder)
                .fitCenter()
                .into(mImageView);

    }
}
