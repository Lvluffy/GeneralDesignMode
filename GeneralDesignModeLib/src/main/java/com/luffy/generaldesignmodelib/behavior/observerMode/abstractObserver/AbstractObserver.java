package com.luffy.generaldesignmodelib.behavior.observerMode.abstractObserver;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 观察者模式~抽象观察者
 */
public interface AbstractObserver {

    /**
     * 更新
     *
     * @param data
     * @return
     */
    String update(Object data);
}
