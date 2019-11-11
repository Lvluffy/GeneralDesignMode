package com.luffy.generaldesignmodelib.structure.bridgeMode.abstraction;


import com.luffy.generaldesignmodelib.structure.bridgeMode.implementor.ImplementorCoffee;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 桥接模式~扩展抽象化角色～咖啡～小杯
 */
public class RefinedAbstractionCoffeeSmall extends AbstractionCoffee {

    /**
     * 构造函数
     *
     * @param implementorCoffee
     */
    public RefinedAbstractionCoffeeSmall(ImplementorCoffee implementorCoffee) {
        super(implementorCoffee);
    }

    @Override
    public String operationCoffee() {
        return "小杯的" + implementorCoffee.operationImplCoffee() + "咖啡\n";
    }
}
