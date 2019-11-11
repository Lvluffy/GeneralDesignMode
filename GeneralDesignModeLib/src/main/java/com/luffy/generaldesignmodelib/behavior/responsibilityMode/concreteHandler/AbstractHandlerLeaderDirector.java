package com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler;


import com.luffy.generaldesignmodelib.behavior.responsibilityMode.abstractHandler.AbstractHandlerLeader;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 责任链模式~具体处理者~领导者~主管
 */
public class AbstractHandlerLeaderDirector extends AbstractHandlerLeader {

    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public String handle(int money) {
        return "主管审批报销" + money + "元";
    }

}
