package com.luffy.generaldesignmode.ui.create;

import android.widget.TextView;

import com.luffy.generaldesignmodelib.create.factoryMethodMode.FactoryMethodModeTest;
import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * Factory(工厂方法)模式
 */
public class FactoryModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView txt_show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_factory_mode;
    }

    @Override
    public int setLayoutView() {
        return R.layout.activity_design_mode_base;
    }

    @Override
    public void initView() {
        /*测试工厂方法模式*/
        txt_show.setText(FactoryMethodModeTest.testFactoryMode());
    }

}
