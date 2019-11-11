package com.luffy.generaldesignmodelib.structure.bridgeMode.abstraction;


import com.luffy.generaldesignmodelib.structure.bridgeMode.implementor.ImplementorCoffee;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 桥接模式~扩展抽象化角色～咖啡～大杯
 */
public class RefinedAbstractionCoffeeLarge extends AbstractionCoffee {

    /**
     * 构造函数
     *
     * @param implementorCoffee
     */
    public RefinedAbstractionCoffeeLarge(ImplementorCoffee implementorCoffee) {
        super(implementorCoffee);
    }

    @Override
    public String operationCoffee() {
        return "大杯的" + implementorCoffee.operationImplCoffee() + "咖啡\n";
    }
}
