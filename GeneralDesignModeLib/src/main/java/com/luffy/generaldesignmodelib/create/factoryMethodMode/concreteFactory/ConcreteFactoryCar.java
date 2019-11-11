package com.luffy.generaldesignmodelib.create.factoryMethodMode.concreteFactory;


import com.luffy.generaldesignmodelib.create.factoryMethodMode.abstractFactory.AbstractFactoryCar;
import com.luffy.generaldesignmodelib.create.factoryMethodMode.abstractProduct.AbstractProductCar;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 工厂方法模式~具体工厂～汽车
 */
public class ConcreteFactoryCar implements AbstractFactoryCar {
    /**
     * 创建汽车
     *
     * @param cls
     * @return
     */
    @Override
    public <T extends AbstractProductCar> T createProduct(Class<T> cls) {
        AbstractProductCar car = null;
        try {
            /*利用反射机制获取指定的类(汽车产品)*/
            car = (AbstractProductCar) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
