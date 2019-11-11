package com.luffy.generaldesignmodelib.create.factoryMethodMode.concreteProduct;


import com.luffy.generaldesignmodelib.create.factoryMethodMode.abstractProduct.AbstractProductCar;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 工厂方法模式～具体产品～汽车～宝马
 */
public class ConcreteProductCarBaoMa implements AbstractProductCar {
    /**
     * 无人驾驶
     */
    @Override
    public String drive() {
        return "宝马启动了！";
    }

    /**
     * 自动导航
     */
    @Override
    public String selfNavigation() {
        return "宝马开始自动导航！";
    }

    @Override
    public String toString() {
        return drive() + "\n" + selfNavigation() + "\n";
    }
}
