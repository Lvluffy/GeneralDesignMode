package com.luffy.generaldesignmode.base;

import android.view.View;

/**
 * Created by lvlufei on 2017/11/1.
 */
public abstract class BaseViewHolder {

    /**
     * 构造函数
     *
     * @param view
     */
    public BaseViewHolder(View view) {
        initView(view);
    }

    /**
     * 初始化控件
     *
     * @param view
     */
    protected abstract void initView(View view);
}
