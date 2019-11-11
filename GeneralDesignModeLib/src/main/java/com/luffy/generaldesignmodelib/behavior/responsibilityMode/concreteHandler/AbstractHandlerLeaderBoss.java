package com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler;

import com.luffy.generaldesignmodelib.behavior.responsibilityMode.abstractHandler.AbstractHandlerLeader;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 责任链模式~具体处理者~领导者~老板
 */
public class AbstractHandlerLeaderBoss extends AbstractHandlerLeader {

    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String handle(int money) {
        return "老板审批报销" + money + "元";
    }

}
