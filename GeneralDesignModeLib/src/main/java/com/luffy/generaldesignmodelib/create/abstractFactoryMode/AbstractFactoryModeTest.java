package com.luffy.generaldesignmodelib.create.abstractFactoryMode;


import com.luffy.generaldesignmodelib.create.abstractFactoryMode.abstractFactory.AbstractFactoryCar;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteFactory.ConcreteFactoryCarQ3;
import com.luffy.generaldesignmodelib.create.abstractFactoryMode.concreteFactory.ConcreteFactoryCarQ7;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name
 * @desc
 */
public class AbstractFactoryModeTest {

    /**
     * 测试~抽象工厂模式
     *
     * @return
     */
    public static String testAbstractFactoryMode() {
        /*Q3汽车*/
        AbstractFactoryCar factoryQ3 = new ConcreteFactoryCarQ3();
        /*Q7汽车*/
        AbstractFactoryCar factoryQ7 = new ConcreteFactoryCarQ7();
        /*组装数据*/
        String s = "----------Q3汽车----------\n" +
                factoryQ3.createProductTire().tire() +
                factoryQ3.createProductEngine().engine() +
                factoryQ3.createProductBrake().brake() +
                "----------Q7汽车----------\n" +
                factoryQ7.createProductTire().tire() +
                factoryQ7.createProductEngine().engine() +
                factoryQ7.createProductBrake().brake();
        return s;
    }

    public static void main(String[] args) {
        System.out.print(testAbstractFactoryMode());
    }
}
