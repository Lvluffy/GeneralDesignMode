package com.luffy.generaldesignmodelib.behavior.observerMode.concreteSubject;


import com.luffy.generaldesignmodelib.behavior.observerMode.abstractSubject.AbstractObservable;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 观察者模式~具体的~被观察者角色
 */
public class ConcreteObservable extends AbstractObservable {

    @Override
    public String notifyObserver(String content) {
        /*标识状态或者内容发生改变*/
        setChanged();
        /*通知所有观察者*/
        return notifyObservers(content);
    }
}
