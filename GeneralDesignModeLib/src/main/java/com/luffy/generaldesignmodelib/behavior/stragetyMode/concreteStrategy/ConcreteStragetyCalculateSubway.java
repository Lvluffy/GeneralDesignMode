package com.luffy.generaldesignmodelib.behavior.stragetyMode.concreteStrategy;


import com.luffy.generaldesignmodelib.behavior.stragetyMode.abstractStrategy.AbstractStragetyCalculate;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 策略模式~具体策略~计算器~地铁
 * <p>
 * 根据距离计算价格（6公里（含）内3元；6~12公里（含）4元；12~22（含）5元；22~32（含）6元;超出32公里统一为7元。）
 */
public class ConcreteStragetyCalculateSubway implements AbstractStragetyCalculate {

    @Override
    public int calculate(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km <= 32) {
            return 6;
        }
        return 7;
    }
}
