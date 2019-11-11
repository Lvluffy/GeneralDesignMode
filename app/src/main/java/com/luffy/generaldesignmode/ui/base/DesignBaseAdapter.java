package com.luffy.generaldesignmode.ui.base;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.luffy.generaldesignmode.R;

import com.luffy.generaldesignmode.base.BaseListAdapter;
import com.luffy.generaldesignmode.mode.BaseBean;

import java.util.ArrayList;

/**
 * Created by lvlufei on 2017/11/1.
 */
public class DesignBaseAdapter<T extends BaseBean> extends BaseListAdapter {

    private ArrayList<DesignBaseBean> mDatas;

    /**
     * 构造函数
     *
     * @param ctx
     * @param list
     */
    public DesignBaseAdapter(Context ctx, ArrayList<T> list) {
        super(ctx, list);
        this.mDatas = (ArrayList<DesignBaseBean>) list;
    }

    /**
     * 获取
     *
     * @param position
     * @param view
     * @param parent
     * @return
     */
    public View getViewNew(int position, View view, ViewGroup parent) {
        DesignBaseViewHolder holder;
        if (view == null) {
            view = getLayoutInflater(ctx).inflate(R.layout.item_design_mode_base, null);
            holder = new DesignBaseViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (DesignBaseViewHolder) view.getTag();
        }

        holder.textView.setText(mDatas.get(position).hint);
        return view;
    }

    /**
     * 子项点击监听
     */
    public AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
            Intent intent = new Intent();
            intent.setClass(ctx, mDatas.get(position).getActivityName());
            ctx.startActivity(intent);
        }
    };
}
