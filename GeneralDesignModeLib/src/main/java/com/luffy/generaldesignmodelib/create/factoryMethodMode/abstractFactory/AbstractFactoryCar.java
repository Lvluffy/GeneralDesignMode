package com.luffy.generaldesignmodelib.create.factoryMethodMode.abstractFactory;


import com.luffy.generaldesignmodelib.create.factoryMethodMode.abstractProduct.AbstractProductCar;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 工厂方法模式~抽象工厂~汽车
 */
public interface AbstractFactoryCar {

    /**
     * 创建产品
     *
     * @param cls
     * @param <T>
     * @return
     */
    <T extends AbstractProductCar> T createProduct(Class<T> cls);
}
