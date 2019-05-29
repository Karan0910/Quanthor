package com.app.quanthor.activity.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.quanthor.R;

/**
 * Created by Karan on 29-05-2019.
 */

public class IntialScreenAdapter extends PagerAdapter {

    private Context mContext;

    public IntialScreenAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {

        ViewGroup layout;
        LayoutInflater inflater = LayoutInflater.from(mContext);


        switch (position) {
            case 0:

                layout = (ViewGroup) inflater.inflate(R.layout.pager_fragment_one, collection, false);
                break;
            case 1:
                layout = (ViewGroup) inflater.inflate(R.layout.pager_fragment_two, collection, false);
                break;
            default:
                layout = (ViewGroup) inflater.inflate(R.layout.pager_fragment_one, collection, false);
        }

        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

}
