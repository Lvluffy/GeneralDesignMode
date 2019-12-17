package com.luffy.generaldesignmodelib.structure.bridgeMode;

import com.luffy.generaldesignmodelib.structure.bridgeMode.abstraction.RefinedAbstractionCoffeeLarge;
import com.luffy.generaldesignmodelib.structure.bridgeMode.abstraction.RefinedAbstractionCoffeeSmall;
import com.luffy.generaldesignmodelib.structure.bridgeMode.implementor.ConcreteImplementorCoffeeOrdinary;
import com.luffy.generaldesignmodelib.structure.bridgeMode.implementor.ConcreteImplementorCoffeeSugar;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 桥接模式~测试
 * @desc
 */
public class BridgeModeTest {

    public static String testBridgeMode() {
        /*原汁原味*/
        ConcreteImplementorCoffeeOrdinary coffeeOrdinary = new ConcreteImplementorCoffeeOrdinary();
        /*准备糖类*/
        ConcreteImplementorCoffeeSugar coffeeSugar = new ConcreteImplementorCoffeeSugar();
        /*大杯原味*/
        RefinedAbstractionCoffeeLarge coffeeLargeOrdinary = new RefinedAbstractionCoffeeLarge(coffeeOrdinary);
        /*大杯加糖*/
        RefinedAbstractionCoffeeLarge coffeeLargeSugar = new RefinedAbstractionCoffeeLarge(coffeeSugar);
        /*小杯原味*/
        RefinedAbstractionCoffeeSmall coffeeSmallOrdinary = new RefinedAbstractionCoffeeSmall(coffeeOrdinary);
        /*小杯加糖*/
        RefinedAbstractionCoffeeSmall coffeeSmallSugar = new RefinedAbstractionCoffeeSmall(coffeeSugar);
        /*组装数据*/
        String s = coffeeLargeOrdinary.operationCoffee() +
                coffeeLargeSugar.operationCoffee() +
                coffeeSmallOrdinary.operationCoffee() +
                coffeeSmallSugar.operationCoffee();
        return s;
    }

    public static void main(String[] args) {
        System.out.print(testBridgeMode());
    }
}
