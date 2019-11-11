package com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteFactory;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractFactory.AbstractFactoryCar;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductBrake;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductEngine;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductTire;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct.ConcreteProductBrakeSUV;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct.ConcreteProductEngineSUV;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct.ConcreteProductTireSUV;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式~具体工厂~汽车~Q7
 */
public class ConcreteFactoryCarQ7 implements AbstractFactoryCar {
    @Override
    public AbstractProductTire createProductTire() {
        return new ConcreteProductTireSUV();
    }

    @Override
    public AbstractProductEngine createProductEngine() {
        return new ConcreteProductEngineSUV();
    }

    @Override
    public AbstractProductBrake createProductBrake() {
        return new ConcreteProductBrakeSUV();
    }
}
