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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("----------Q3汽车----------\n");
        stringBuffer.append(factoryQ3.createProductTire().tire());
        stringBuffer.append(factoryQ3.createProductEngine().engine());
        stringBuffer.append(factoryQ3.createProductBrake().brake());
        stringBuffer.append("----------Q7汽车----------\n");
        stringBuffer.append(factoryQ7.createProductTire().tire());
        stringBuffer.append(factoryQ7.createProductEngine().engine());
        stringBuffer.append(factoryQ7.createProductBrake().brake());
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.print(testAbstractFactoryMode());
    }
}
