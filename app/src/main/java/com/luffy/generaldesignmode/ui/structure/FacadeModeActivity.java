package com.luffy.generaldesignmode.ui.structure;

import android.widget.TextView;

import com.luffy.generaldesignmodelib.structure.facadeMode.FacadeModeTest;
import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 外观模式
 */
public class FacadeModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView txt_show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_facade_mode;
    }

    @Override
    public int setLayoutView() {
        return R.layout.activity_design_mode_base;
    }

    @Override
    public void initView() {
        /*测试外观模式*/
        txt_show.setText(FacadeModeTest.testFacadeMode());
    }

}