package com.luffy.generaldesignmodelib.behavior.observerMode.abstractSubject;


import com.luffy.generaldesignmodelib.behavior.observerMode.abstractObserver.AbstractObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 观察模式~被观察者
 */
public abstract class AbstractObservable {

    List<AbstractObserver> abstractObservers = new ArrayList<>();

    boolean changed = false;

    /**
     * 被观察者~构造函数
     */
    public AbstractObservable() {

    }

    /**
     * 被观察者~添加观察者
     *
     * @param abstractObserver
     */
    public void addObserver(AbstractObserver abstractObserver) {
        if (abstractObserver == null) {
            throw new NullPointerException("observer == null");
        }
        synchronized (this) {
            if (!abstractObservers.contains(abstractObserver))
                abstractObservers.add(abstractObserver);
        }
    }

    /**
     * 清空改变的状态
     */
    protected void clearChanged() {
        changed = false;
    }

    /**
     * 统计观察者人数
     *
     * @return
     */
    public int countObservers() {
        return abstractObservers.size();
    }

    /**
     * 删除指定的观察者
     *
     * @param observer
     */
    public synchronized void deleteObserver(java.util.Observer observer) {
        abstractObservers.remove(observer);
    }

    /**
     * 删除所有的观察者
     */
    public synchronized void deleteObservers() {
        abstractObservers.clear();
    }

    /**
     * 判断是否发生了改变
     *
     * @return
     */
    public boolean hasChanged() {
        return changed;
    }

    /**
     * 通知所有的观察者
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 通知所有的观察者
     *
     * @param data
     */
    @SuppressWarnings("unchecked")
    public String notifyObservers(Object data) {
        StringBuilder test = new StringBuilder();
        int size = 0;
        AbstractObserver[] arrays = null;
        synchronized (this) {
            if (hasChanged()) {
                clearChanged();
                size = abstractObservers.size();
                arrays = new AbstractObserver[size];
                abstractObservers.toArray(arrays);
            }
        }
        if (arrays != null) {
            for (AbstractObserver abstractObserver : arrays) {
                test.append(abstractObserver.update(data)).append("\n");
            }
        }
        return test.toString();
    }

    /**
     * 设置改变的状态
     */
    protected void setChanged() {
        changed = true;
    }

    /**
     * 通知观察者
     *
     * @param content
     * @return
     */
    public abstract String notifyObserver(String content);
}
