package com.luffy.generaldesignmode.ui.behavior;

import android.widget.TextView;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;
import com.luffy.generaldesignmodelib.behavior.iteratorMode.IteratorModeTest;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 迭代器模式
 */
public class IteratorModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_iterator_cursor_mode;
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
        show.setText(IteratorModeTest.testIteratorMode());
    }

}
