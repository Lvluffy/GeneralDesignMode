package com.luffy.generaldesignmodelib.structure.bridgeMode.abstraction;


import com.luffy.generaldesignmodelib.structure.bridgeMode.implementor.ImplementorCoffee;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 案例：我们在喝咖啡时，大家都知道去咖啡馆和咖啡一般分为4种。大杯加糖、大杯不加糖、小杯加糖、小杯不加糖，
 * 对于一杯咖啡来说这4中实质就两种变化，一是大小杯，二是加不加糖。
 * <p/>
 * 桥接模式~抽象化角色～咖啡
 */
public abstract class AbstractionCoffee {
    /**
     * 引用实现部分对象
     */
    protected ImplementorCoffee implementorCoffee;

    /**
     * 构造函数
     *
     * @param implementorCoffee
     */
    public AbstractionCoffee(ImplementorCoffee implementorCoffee) {
        this.implementorCoffee = implementorCoffee;
    }

    /**
     * 制作咖啡-具体是什么样的由子类决定
     *
     * @return
     */
    public abstract String operationCoffee();
}
