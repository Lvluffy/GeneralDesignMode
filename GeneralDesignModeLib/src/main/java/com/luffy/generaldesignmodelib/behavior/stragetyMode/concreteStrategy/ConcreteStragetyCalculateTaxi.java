package com.luffy.generaldesignmodelib.behavior.stragetyMode.concreteStrategy;


import com.luffy.generaldesignmodelib.behavior.stragetyMode.abstractStrategy.AbstractStragetyCalculate;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 策略模式~具体策略~计算器~出租车
 * <p>
 * 根据距离计算价格（简单计算：每公里2元钱）
 */
public class ConcreteStragetyCalculateTaxi implements AbstractStragetyCalculate {

    @Override
    public int calculate(int km) {
        return km * 2;
    }
}
