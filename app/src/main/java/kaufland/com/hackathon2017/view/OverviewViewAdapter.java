package kaufland.com.hackathon2017.view;

import android.content.ClipData;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by sbra0902 on 26.10.17.
 */
@EBean
public class OverviewViewAdapter extends RecyclerView.Adapter<ViewWrapper<RecipeView>> {

    @RootContext
    protected Context mContext;

    @Override
    public ViewWrapper<RecipeView> onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewWrapper<RecipeView> holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

//    private List<ClipData.Item> mData = new CopyOnWriteArrayList<>();
//
//    private List<Item> mRawCategories;
//
//    private OfferCycleData mOfferCycleData;
//
//    private Map<String, Integer> mItemCount = new ConcurrentHashMap<>();
//
//    @Override
//    public ViewWrapper<View> onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        if (viewType == OfferItemType.DISCLAIMER) {
//            OfferDisclaimerView disclaimerView = OfferDisclaimerView_.build(mContext);
//            return new ViewWrapper<View>(disclaimerView);
//
//        } else if (viewType == OfferItemType.CATEGORY) {
//            OfferCategoryItemView view = OfferCategoryItemView_.build(mContext);
//            return new ViewWrapper<View>(view);
//
//        } else {
//            OfferItemContainerView view = OfferItemContainerView_.build(mContext);
//            final ViewWrapper<View> viewViewWrapper = new ViewWrapper<View>(view);
//            return viewViewWrapper;
//        }
//    }
//
//    @Override
//    public void onBindViewHolder(ViewWrapper<View> holder, int position) {
//
//        if (position == getItemCount() - 1) {
//            setDisclaimerText(holder);
//            return;
//        }
//
//        OfferRecyclerBinder binder = (OfferRecyclerBinder) holder.getView();
//        binder.bind(mData.get(position), mRawCategories, position / 2, mItemCount);
//    }
//
//    private void setDisclaimerText(ViewWrapper<View> holder) {
//        OfferDisclaimerView offerDisclaimerView = (OfferDisclaimerView) holder.getView();
//        if (mOfferCycleData != null) {
//            offerDisclaimerView.bind(mOfferCycleData);
//        }
//    }
//
//    public void addItemList(List<Item> data) {
//        mRawCategories = data;
//        mData.clear();
//        mData.addAll(addContainerToCategories(data));
//        notifyDataSetChanged();
//    }
//
//    @Override
//    public int getItemViewType(int position) {
//
//        if (position == getItemCount() - 1) {
//            return OfferItemType.DISCLAIMER;
//        }
//        if (position % 2 == 0) {
//            return OfferItemType.CATEGORY;
//        } else {
//            return OfferItemType.OFFER_CONTAINER;
//        }
//    }
//
//    private List<Item> addContainerToCategories(List<Item> results) {
//
//        List<Item> mixedList = new ArrayList<>();
//
//        for (int i = 0; i < results.size(); i++) {
//            mixedList.addAll(Arrays.asList(results.get(i), results.get(i)));
//        }
//
//        return mixedList;
//    }
//
//    @Override
//    public int getItemCount() {
//        return mOfferCycleData != null && mOfferCycleData.getDisclaimerList() != null ? mData.size() + 1 : mData.size();
//    }
//
//    public void setCurrentOfferCycleData(OfferCycleData item) {
//        mOfferCycleData = item;
//    }
//
//    public void refreshItemCount(Map<String, Integer> itemCount) {
//        mItemCount.clear();
//        mItemCount.putAll(itemCount);
//        notifyDataSetChanged();
//    }
}
