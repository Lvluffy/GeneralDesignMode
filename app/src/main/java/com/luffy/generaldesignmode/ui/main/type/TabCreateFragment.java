package com.luffy.generaldesignmode.ui.main.type;

import android.widget.ListView;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.base.BaseFragment;
import com.luffy.generaldesignmode.ui.base.DesignBaseAdapter;
import com.luffy.generaldesignmode.ui.base.DesignBaseBean;
import com.luffy.generaldesignmode.ui.manager.DesignModeTypeCreateManager;
import com.luffy.utilslib.utils.ValidUtils;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 设计模式~创建模式
 */
public class TabCreateFragment extends BaseFragment {

    @BindView(R.id.listView)
    ListView listView;
    /*适配器*/
    DesignBaseAdapter adapter;
    /*数据*/
    ArrayList<DesignBaseBean> list = new ArrayList<>();

    @Override
    public int setLayoutView() {
        return R.layout.fragment_list_base;
    }

    @Override
    public void initView() {
        if (ValidUtils.getInstance().isValid(list) && list.size() > 0) {
            list.clear();
        }
        DesignModeTypeCreateManager[] tabs = DesignModeTypeCreateManager.values();
        for (int i = 0; i < tabs.length; i++) {
            DesignModeTypeCreateManager tab = tabs[i];
            DesignBaseBean viewBean = new DesignBaseBean();
            viewBean.setHint((tab.getId() + 1) + "、" + getString(tab.getName()));
            viewBean.setActivityName(tab.getClz());
            list.add(viewBean);
        }
        adapter = new DesignBaseAdapter(getContext(), list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(adapter.onItemClickListener);
    }
}