package com.luffy.generaldesignmode.ui.main.entrance;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.luffy.generaldesignmode.R;
import com.luffy.dialoglib.toast.ToastBuilder;
import com.luffy.generaldesignmode.base.BaseActivity;
import com.luffy.generaldesignmode.base.BaseFragment;
import com.luffy.generaldesignmode.base.BaseViewPagerAdapter;
import com.luffy.utilslib.utils.AppUtils;
import com.luffy.utilslib.utils.DoubleClickExitUtils;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 */
public class MainActivity extends BaseActivity implements
        TabHost.OnTabChangeListener,
        ViewPager.OnPageChangeListener{

    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.tabhost)
    FragmentTabHost tabhost;

    /*存放视图的集合*/
    ArrayList<BaseFragment> views;

    @Override
    public boolean visibilityTitleLayout() {
        return false;
    }

    @Override
    public int setLayoutView() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        /*初始化选项卡*/
        initTabHost();
        /*初始化ViewPager*/
        initViewPager();
    }

    /**
     * 初始化选项卡
     */
    private void initTabHost() {
        /*设置~选项卡点击时，加载Fragment区域*/
        tabhost.setup(this, getSupportFragmentManager(), R.id.viewPager);
        /*去除选项卡之间的分割线~可有可无（主要是UI上显示）*/
        if (Build.VERSION.SDK_INT > 10) {
            tabhost.getTabWidget().setShowDividers(0);
        }
        /*获取子项模块的界面以及进行遍历处理*/
        MainTabHost[] tabHosts = MainTabHost.values();
        for (int i = 0; i < tabHosts.length; i++) {
            MainTabHost tabHost = tabHosts[i];
            TabHost.TabSpec tab = tabhost.newTabSpec(getString(tabHost.getName()));
            /*选项卡~子项布局~获取*/
            View indicator = LayoutInflater.from(getApplicationContext()).inflate(R.layout.layout_tabhost, null);
            /*选项卡~子项布局~赋值*/
            TextView title = indicator.findViewById(R.id.tab_title);
            /*设置图片及文字*/
            Drawable drawable = this.getResources().getDrawable(tabHost.getIcon());
            title.setCompoundDrawablesWithIntrinsicBounds(null, drawable, null, null);
            title.setText(getString(tabHost.getName()));
            /*选项卡~设置~指示器*/
            tab.setIndicator(indicator);
            /*添加~选项卡*/
            tabhost.addTab(tab, tabHost.getCls(), null);
            /*选项卡~添加改变触摸监听器*/
            tabhost.setOnTabChangedListener(this);
        }
    }

    /**
     * 初始化ViewPager
     */
    private void initViewPager() {
        /*ViewPager绑定子界面*/
        views = new ArrayList<>();
        MainTabHost[] tabHosts = MainTabHost.values();
        /*获取ViewPager子项的数量*/
        for (int i = 0; i < MainTabHost.values().length; i++) {
            MainTabHost tabHost = tabHosts[i];
            try {
                views.add((BaseFragment) tabHost.getCls().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        /*ViewPager进行适配*/
        viewPager.setAdapter(new BaseViewPagerAdapter(getSupportFragmentManager(), views));
        viewPager.addOnPageChangeListener(this);
    }

    /**
     * 手动设置ViewPager要显示的视图
     *
     * @param desTab
     */
    private void changeView(int desTab) {
        viewPager.setCurrentItem(desTab, true);
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return DoubleClickExitUtils.getInstance().exit(mContext, new DoubleClickExitUtils.IDoubleClickExitCallBack() {
                @Override
                public void hanlderToastShow() {
                    new ToastBuilder(mContext)
                            .setTitle(String.format(MainActivity.this.getString(R.string.utils_double_click_exit_hint), AppUtils.getInstance().getAppName(mContext)))
                            .setGravity(Gravity.BOTTOM)
                            .show();
                }
            });
        }
        return super.onKeyDown(keyCode, event);
    }

    /*------------------------------以下是TabHost.OnTabChangeListener回调------------------------------*/
    @Override
    public void onTabChanged(String tabId) {
        for (int i = 0; i < tabhost.getTabWidget().getTabCount(); i++) {
            View view = tabhost.getTabWidget().getChildAt(i);
            if (i == tabhost.getCurrentTab()) {
                view.setSelected(true);
                changeView(i);
            } else {
                view.setSelected(false);
            }
        }
    }

    /*------------------------------以下是ViewPager.OnPageChangeListener回调------------------------------*/
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        for (int i = 0; i < tabhost.getTabWidget().getTabCount(); i++) {
            View view = tabhost.getTabWidget().getChildAt(i);
            view.setSelected(true);
            if (i == position) {
                view.setSelected(true);
                changeView(i);
            } else {
                view.setSelected(false);
            }
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

}
