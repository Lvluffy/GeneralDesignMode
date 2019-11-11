package com.luffy.generaldesignmode.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by lvlufei on 2017/11/1.
 */
public class BaseViewPagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<BaseFragment> views;

    public BaseViewPagerAdapter(FragmentManager fm, ArrayList<BaseFragment> views) {
        super(fm);
        this.views = views;
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        return views.get(position);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return views.size();
    }
}
