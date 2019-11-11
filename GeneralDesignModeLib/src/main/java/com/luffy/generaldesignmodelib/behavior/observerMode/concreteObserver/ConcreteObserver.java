package com.luffy.generaldesignmodelib.behavior.observerMode.concreteObserver;


import com.luffy.generaldesignmodelib.behavior.observerMode.abstractObserver.AbstractObserver;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 观察者模式~具体观察者
 */
public class ConcreteObserver implements AbstractObserver {

    public String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public String update(Object data) {
        return name + "——更新了。内容：" + data;
    }
}
