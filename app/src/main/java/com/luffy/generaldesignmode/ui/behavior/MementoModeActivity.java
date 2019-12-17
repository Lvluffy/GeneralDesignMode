package com.luffy.generaldesignmode.ui.behavior;

import android.widget.TextView;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;
import com.luffy.generaldesignmodelib.behavior.mementoMode.MementoModeTest;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 备忘录模式
 */
public class MementoModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_memento_mode;
    }

    @Override
    public int setLayoutView() {
        return R.layout.activity_design_mode_base;
    }

    @Override
    public void initReceiveData() {

    }

    @Override
    public void initView() {
        /*显示*/
        show.setText(MementoModeTest.testMementoMode());
    }

}
