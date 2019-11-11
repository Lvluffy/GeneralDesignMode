package com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductBrake;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式～具体产品~制动系统~越野
 */
public class ConcreteProductBrakeSUV implements AbstractProductBrake {
    @Override
    public String brake() {
        return "越野制动\n";
    }
}
