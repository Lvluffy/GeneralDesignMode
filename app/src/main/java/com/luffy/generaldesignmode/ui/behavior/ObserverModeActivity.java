package com.luffy.generaldesignmode.ui.behavior;

import android.widget.TextView;

import com.luffy.generaldesignmodelib.behavior.observerMode.ObserverModeTest;
import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 观察者模式
 */
public class ObserverModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_observer_mode;
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
        /*显示内容*/
        show.setText(ObserverModeTest.testObserverMode());
    }

}
