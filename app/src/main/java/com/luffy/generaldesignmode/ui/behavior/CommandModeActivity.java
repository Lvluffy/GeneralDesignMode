package com.luffy.generaldesignmode.ui.behavior;

import android.widget.TextView;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;
import com.luffy.generaldesignmodelib.behavior.commandMode.CommandModeTest;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 命令模式
 */
public class CommandModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView txt_show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_command_mode;
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
        /*测试命令模式*/
        txt_show.setText(CommandModeTest.testCommandMode());
    }

}
