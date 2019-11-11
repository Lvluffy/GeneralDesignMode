package com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractFactory;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductBrake;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductEngine;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractProduct.AbstractProductTire;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象工厂模式~抽象工厂~汽车
 */
public interface AbstractFactoryCar {

    /**
     * 创建产品-轮胎
     *
     * @return TireProduct(轮胎类)
     */
    AbstractProductTire createProductTire();

    /**
     * 创建产品-发动机
     *
     * @return EngineProduct（汽车引擎类）
     */
    AbstractProductEngine createProductEngine();

    /**
     * 创建产品-制动系统
     *
     * @return BrakeProduct(汽车刹车类)
     */
    AbstractProductBrake createProductBrake();
}
