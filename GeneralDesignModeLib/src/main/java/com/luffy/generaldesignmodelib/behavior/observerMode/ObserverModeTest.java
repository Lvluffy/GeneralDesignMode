package com.luffy.generaldesignmodelib.behavior.observerMode;

import com.luffy.generaldesignmodelib.behavior.observerMode.abstractObserver.AbstractObserver;
import com.luffy.generaldesignmodelib.behavior.observerMode.concreteObserver.ConcreteObserver;
import com.luffy.generaldesignmodelib.behavior.observerMode.concreteSubject.ConcreteObservable;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 观察者模式～测试
 * @desc
 */
public class ObserverModeTest {

    public static String testObserverMode() {
        /*被观察者对象*/
        ConcreteObservable observable = new ConcreteObservable();
        /*观察者对象*/
        AbstractObserver observer1 = new ConcreteObserver("observer1");
        AbstractObserver observer2 = new ConcreteObserver("observer2");
        AbstractObserver observer3 = new ConcreteObserver("observer3");
        /*将观察者注册到被观察者的列表中*/
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        /*组装数据*/
        //发布消息
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(observable.notifyObserver("新的开发技术前线周报发布啦~"));
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testObserverMode());
    }
}
