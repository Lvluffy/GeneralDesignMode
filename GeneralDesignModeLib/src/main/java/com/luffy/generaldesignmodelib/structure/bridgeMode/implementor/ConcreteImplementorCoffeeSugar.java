package com.luffy.generaldesignmodelib.structure.bridgeMode.implementor;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 桥接模式~具体实现化角色～咖啡~加糖
 */
public class ConcreteImplementorCoffeeSugar extends ImplementorCoffee {

    @Override
    public String operationImplCoffee() {
        return "加糖";
    }
}
