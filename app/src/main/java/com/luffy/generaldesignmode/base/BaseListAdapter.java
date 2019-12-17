package com.luffy.generaldesignmode.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.luffy.generaldesignmode.mode.BaseBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 */
public abstract class BaseListAdapter<T extends BaseBean> extends BaseAdapter {

    public Context ctx;
    public ArrayList<T> mDatas;
    private LayoutInflater mInflater;

    /**
     * 构造函数
     *
     * @param ctx
     */
    public BaseListAdapter(Context ctx) {
        this.ctx = ctx;
    }

    /**
     * 构造函数
     *
     * @param ctx
     * @param list
     */
    public BaseListAdapter(Context ctx, ArrayList<T> list) {
        this.ctx = ctx;
        this.mDatas = list;
    }

    /**
     * 获取~布局填充器
     *
     * @param context
     * @return
     */
    protected LayoutInflater getLayoutInflater(Context context) {
        if (mInflater == null) {
            mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        return mInflater;
    }

    /**
     * 获取数据数量
     *
     * @return
     */
    public int getDataSize() {
        if (mDatas != null)
            return mDatas.size();
        return 0;
    }

    /**
     * 设置数据
     *
     * @param data
     */
    public void setData(ArrayList<T> data) {
        mDatas = data;
        notifyDataSetChanged();
    }

    /**
     * 获取数据
     *
     * @return
     */
    public ArrayList<T> getData() {
        return mDatas == null ? (mDatas = new ArrayList<>()) : mDatas;
    }

    /**
     * 添加数据
     *
     * @param data
     */
    public void addData(List<T> data) {
        if (mDatas != null && data != null && !data.isEmpty()) {
            mDatas.addAll(data);
        }
        notifyDataSetChanged();
    }

    /**
     * 添加子项
     *
     * @param obj
     */
    public void addItem(T obj) {
        if (mDatas != null) {
            mDatas.add(obj);
        }
        notifyDataSetChanged();
    }

    /**
     * 添加子项到指定位置
     *
     * @param pos
     * @param obj
     */
    public void addItem(int pos, T obj) {
        if (mDatas != null) {
            mDatas.add(pos, obj);
        }
        notifyDataSetChanged();
    }

    /**
     * 移除子项
     *
     * @param obj
     */
    public void removeItem(Object obj) {
        mDatas.remove(obj);
        notifyDataSetChanged();
    }

    /**
     * 清空数据
     */
    public void clear() {
        mDatas.clear();
        notifyDataSetChanged();
    }

    /*以下是适配器的四大核心方法*/
    /*获取数据数量*/
    public int getCount() {
        return getDataSize();
    }

    /*获取子项*/
    public Object getItem(int position) {
        if (mDatas.size() > position) {
            return mDatas.get(position);
        }
        return null;
    }

    /*获取子项ID*/
    public long getItemId(int position) {
        return (long) position;
    }

    /*获取视图*/
    public View getView(int position, View view, ViewGroup parent) {
        return this.getViewNew(position, view, parent);
    }

    /**
     * 获取视图~自定义
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    public abstract View getViewNew(int position, View convertView, ViewGroup parent);
}
