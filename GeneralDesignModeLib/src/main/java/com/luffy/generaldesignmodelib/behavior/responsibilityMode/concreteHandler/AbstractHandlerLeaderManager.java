package com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler;


import com.luffy.generaldesignmodelib.behavior.responsibilityMode.abstractHandler.AbstractHandlerLeader;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 责任链模式~具体处理者~领导者~经理
 */
public class AbstractHandlerLeaderManager extends AbstractHandlerLeader {

    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public String handle(int money) {
        return "经理审批报销" + money + "元";
    }

}
