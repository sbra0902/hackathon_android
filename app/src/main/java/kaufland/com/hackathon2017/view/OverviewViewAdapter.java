package kaufland.com.hackathon2017.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.List;

import kaufland.com.business.model.RecipeSearchResultModel;

/**
 * Created by sbra0902 on 26.10.17.
 */
@EBean
public class OverviewViewAdapter extends RecyclerView.Adapter<ViewWrapper<RecipeView>> {

    @RootContext
    protected Context mContext;

    private List<RecipeSearchResultModel> mData = new ArrayList<>();

    @Override
    public ViewWrapper<RecipeView> onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewWrapper<>(RecipeView_.build(mContext));
    }

    @Override
    public void onBindViewHolder(ViewWrapper<RecipeView> holder, int position) {
        holder.getView().bind(mData.get(position));
    }

    public void update(List<RecipeSearchResultModel> data){
        mData = data;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


}
