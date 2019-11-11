package com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductEngine;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式～具体产品~发动机~越野
 */
public class ConcreteProductEngineSUV implements AbstractProductEngine {
    @Override
    public String engine() {
        return "进口发动机\n";
    }
}
