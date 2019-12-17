package com.luffy.generaldesignmode.base;


import android.view.View;

import com.luffy.generalandroidlib.android.fragment.BaseLayerFragment;

import butterknife.ButterKnife;

/**
 * Created by lvlufei on 2017/11/1.
 */

public abstract class BaseFragment extends BaseLayerFragment {

    @Override
    public void bindButterKnife(View rootView) {
        ButterKnife.bind(this, rootView);
    }

    @Override
    public void initPresenter() {

    }
}
