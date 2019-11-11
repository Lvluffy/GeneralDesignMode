package com.luffy.generaldesignmodelib.create.factoryMethodMode;

import com.luffy.generaldesignmodelib.create.factoryMethodMode.abstractFactory.AbstractFactoryCar;
import com.luffy.generaldesignmodelib.create.factoryMethodMode.concreteFactory.ConcreteFactoryCar;
import com.luffy.generaldesignmodelib.create.factoryMethodMode.concreteProduct.ConcreteProductCarBaoMa;
import com.luffy.generaldesignmodelib.create.factoryMethodMode.concreteProduct.ConcreteProductCarBenChi;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 工厂方法模式～测试
 * @desc
 */
public class FactoryMethodModeTest {

    public static String testFactoryMode() {
        /*汽车工厂*/
        AbstractFactoryCar factory = new ConcreteFactoryCar();
        /*宝马汽车*/
        ConcreteProductCarBaoMa baoMaCar = factory.createProduct(ConcreteProductCarBaoMa.class);
        baoMaCar.drive();
        baoMaCar.selfNavigation();
        /*奔驰汽车*/
        ConcreteProductCarBenChi benChiCar = factory.createProduct(ConcreteProductCarBenChi.class);
        benChiCar.drive();
        benChiCar.selfNavigation();
        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(baoMaCar.toString());
        stringBuffer.append(benChiCar.toString());
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.print(testFactoryMode());
    }
}
