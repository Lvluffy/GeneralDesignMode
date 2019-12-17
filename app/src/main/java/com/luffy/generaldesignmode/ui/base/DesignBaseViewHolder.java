package com.luffy.generaldesignmode.ui.base;

import android.view.View;
import android.widget.TextView;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseViewHolder;

/**
 * Created by lvlufei on 2017/11/1.
 */
public class DesignBaseViewHolder extends BaseViewHolder {

    public TextView textView;

    /**
     * 构造函数
     *
     * @param view
     */
    public DesignBaseViewHolder(View view) {
        super(view);
    }

    /**
     * 初始化控件
     *
     * @param view
     */
    @Override
    protected void initView(View view) {
        textView = view.findViewById(R.id.txt_class_item);
    }
}
