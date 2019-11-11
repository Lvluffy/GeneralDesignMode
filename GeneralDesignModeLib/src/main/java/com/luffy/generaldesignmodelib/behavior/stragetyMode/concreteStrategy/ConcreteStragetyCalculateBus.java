package com.luffy.generaldesignmodelib.behavior.stragetyMode.concreteStrategy;


import com.luffy.generaldesignmodelib.behavior.stragetyMode.abstractStrategy.AbstractStragetyCalculate;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 策略模式~具体策略~计算器~公交车
 * <p>
 * 根据距离计算价格（十公里之内一元钱，超过十公里之后每一元钱可以乘坐5公里）
 */
public class ConcreteStragetyCalculateBus implements AbstractStragetyCalculate {

    @Override
    public int calculate(int km) {
        /*超过十公里的距离*/
        int extraJourney = km - 10;
        /*超过的距离是5公里的倍数*/
        int extraFactor = extraJourney / 5;
        /*超过的距离对5公里取余*/
        int fraction = extraJourney % 5;
        /*价格计算*/
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
