package com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductTire;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式～具体产品～轮胎~越野
 */
public class ConcreteProductTireSUV implements AbstractProductTire {
    @Override
    public String tire() {
        return "越野轮胎\n";
    }
}
