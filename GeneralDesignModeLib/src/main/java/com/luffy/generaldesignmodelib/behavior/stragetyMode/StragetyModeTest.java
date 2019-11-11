package com.luffy.generaldesignmodelib.behavior.stragetyMode;

import com.luffy.generaldesignmodelib.behavior.stragetyMode.concreteStrategy.ConcreteStragetyCalculateBus;
import com.luffy.generaldesignmodelib.behavior.stragetyMode.concreteStrategy.ConcreteStragetyCalculateSubway;
import com.luffy.generaldesignmodelib.behavior.stragetyMode.concreteStrategy.ConcreteStragetyCalculateTaxi;
import com.luffy.generaldesignmodelib.behavior.stragetyMode.context.StragetyContext;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 策略模式~测试
 * @desc
 */
public class StragetyModeTest {

    public static String testStragetyMode() {
        /*交通计算器触发器*/
        StragetyContext trigger = new StragetyContext();
        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        //公交车计算价格策略
        trigger.setStragety(new ConcreteStragetyCalculateBus());
        stringBuffer.append("公交车乘16公里的价格：" + trigger.calculate(16) + "\n");
        //地铁计算价格策略
        trigger.setStragety(new ConcreteStragetyCalculateSubway());
        stringBuffer.append("地铁乘16公里的价格：" + trigger.calculate(16) + "\n");
        //出租车计算价格策略
        trigger.setStragety(new ConcreteStragetyCalculateTaxi());
        stringBuffer.append("出租车乘16公里的价格：" + trigger.calculate(16) + "\n");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testStragetyMode());
    }

}
