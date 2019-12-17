package com.luffy.generaldesignmode.ui.create;

import android.widget.TextView;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.AbstractFactoryModeTest;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式
 */
public class AbstractFactoryModeActivity extends BaseActivity {


    /*显示*/
    @BindView(R.id.txt_show)
    TextView txt_show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_abstract_factory_mode;
    }

    @Override
    public int setLayoutView() {
        return R.layout.activity_design_mode_base;
    }

    @Override
    public void initReceiveData() {

    }

    @Override
    public void initPresenter() {

    }

    /**
     * 初始化UI界面
     */
    @Override
    public void initView() {
        /*测试抽象工厂模式*/
        txt_show.setText(AbstractFactoryModeTest.testAbstractFactoryMode());
    }
}
