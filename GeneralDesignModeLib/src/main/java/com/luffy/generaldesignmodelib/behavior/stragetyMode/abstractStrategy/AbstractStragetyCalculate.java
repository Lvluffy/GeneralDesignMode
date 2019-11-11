package com.luffy.generaldesignmodelib.behavior.stragetyMode.abstractStrategy;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 策略模式~抽象策略~计算器
 * <p>
 * 案例：出行坐车价格计算器
 */
public interface AbstractStragetyCalculate {

    /**
     * 根据距离计算价格
     *
     * @param km 公里
     * @return 返回价格
     */
    int calculate(int km);
}
