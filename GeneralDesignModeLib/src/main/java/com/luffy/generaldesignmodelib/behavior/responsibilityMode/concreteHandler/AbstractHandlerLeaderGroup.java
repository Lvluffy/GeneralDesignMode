package com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler;


import com.luffy.generaldesignmodelib.behavior.responsibilityMode.abstractHandler.AbstractHandlerLeader;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 责任链模式~具体处理者~领导者~组长
 */
public class AbstractHandlerLeaderGroup extends AbstractHandlerLeader {

    @Override
    public int limit() {
        return 1000;
    }

    /**
     * 处理报销行为
     *
     * @param money 具体金额
     * @return
     */
    @Override
    public String handle(int money) {
        return "组长审批报销" + money + "元";
    }

}
