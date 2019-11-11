package com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductTire;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式～具体产品~轮胎~普通
 */
public class ConcreteProductTireNormal implements AbstractProductTire {
    @Override
    public String tire() {
        return "普通轮胎\n";
    }
}
