package com.luffy.generaldesignmodelib.structure.bridgeMode.implementor;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 桥接模式~实现化角色~咖啡
 */
public abstract class ImplementorCoffee {

    /**
     * 制作实现咖啡-具体添加什么由子类实现
     *
     * @return
     */
    public abstract String operationImplCoffee();
}
