package com.luffy.generaldesignmode.ui.structure;

import android.widget.TextView;

import com.luffy.generaldesignmodelib.structure.proxyMode.ProxyModeTest;
import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 代理模式
 */
public class ProxyModeActivity extends BaseActivity {

    /*显示*/
    @BindView(R.id.txt_show)
    TextView txt_show;

    @Override
    public int setTitleInt() {
        return R.string.ui_test_proxy_mode;
    }

    @Override
    public int setLayoutView() {
        return R.layout.activity_design_mode_base;
    }

    @Override
    public void initView() {
        txt_show.setText(ProxyModeTest.testProxyMode());
    }

}
