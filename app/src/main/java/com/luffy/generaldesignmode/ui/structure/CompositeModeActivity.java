package com.luffy.generaldesignmode.ui.structure;

import android.widget.TextView;

import com.luffy.generaldesignmodelib.structure.compositeMode.CompositeModeTest;
import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 组合模式
 */
public class CompositeModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView txt_show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_composite_mode;
    }

    @Override
    public int setLayoutView() {
        return R.layout.activity_design_mode_base;
    }

    /**
     * 初始化UI界面
     */
    @Override
    public void initView() {
        /*测试组合模式*/
        txt_show.setText(CompositeModeTest.testCompositeMode());
    }

}
