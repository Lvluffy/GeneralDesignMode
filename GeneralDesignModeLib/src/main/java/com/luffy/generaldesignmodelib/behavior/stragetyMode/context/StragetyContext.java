package com.luffy.generaldesignmodelib.behavior.stragetyMode.context;


import com.luffy.generaldesignmodelib.behavior.stragetyMode.abstractStrategy.AbstractStragetyCalculate;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 策略模式~环境类
 */
public class StragetyContext {

    /*计算器策略*/
    AbstractStragetyCalculate mStragety;

    /**
     * 设置策略
     *
     * @param mStragety 价钱计算策略
     */
    public void setStragety(AbstractStragetyCalculate mStragety) {
        this.mStragety = mStragety;
    }

    /**
     * 计算出行价格
     *
     * @param km
     * @return
     */
    public int calculate(int km) {
        return mStragety.calculate(km);
    }
}
