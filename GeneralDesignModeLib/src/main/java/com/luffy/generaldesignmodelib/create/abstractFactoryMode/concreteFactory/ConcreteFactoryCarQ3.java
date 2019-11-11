package com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteFactory;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractFactory.AbstractFactoryCar;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductBrake;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductEngine;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductTire;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct.ConcreteProductBrakeNormal;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct.ConcreteProductEngineNormal;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteProduct.ConcreteProductTireNormal;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式~具体工厂~汽车~Q3
 */
public class ConcreteFactoryCarQ3 implements AbstractFactoryCar {
    @Override
    public AbstractProductTire createProductTire() {
        return new ConcreteProductTireNormal();
    }

    @Override
    public AbstractProductEngine createProductEngine() {
        return new ConcreteProductEngineNormal();
    }

    @Override
    public AbstractProductBrake createProductBrake() {
        return new ConcreteProductBrakeNormal();
    }
}
