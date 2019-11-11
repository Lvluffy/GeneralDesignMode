package com.luffy.generaldesignmode.base;

import com.luffy.uilib.android.activity.BaseLayerActivity;

import butterknife.ButterKnife;

/**
 * Created by lvlufei on 2017/11/1.
 */
public abstract class BaseActivity extends BaseLayerActivity {

    @Override
    public void bindButterKnife() {
        ButterKnife.bind(this);
    }

    @Override
    public void initPresenter() {

    }

}
