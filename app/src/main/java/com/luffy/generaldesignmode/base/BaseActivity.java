package com.luffy.generaldesignmode.base;

import android.app.Activity;

import com.luffy.generalandroidlib.android.activity.BaseLayerActivity;

import butterknife.ButterKnife;

/**
 * Created by lvlufei on 2017/11/1.
 */
public abstract class BaseActivity extends BaseLayerActivity {

    @Override
    public void bindButterKnife(Activity target) {
        ButterKnife.bind(target);
    }

    @Override
    public void initPresenter() {

    }

}
