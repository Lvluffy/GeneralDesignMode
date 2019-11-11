package com.luffy.generaldesignmodelib.behavior.responsibilityMode.abstractHandler;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 责任链模式~抽象处理者~领导者
 * <p/>
 * 案例：小明出国学习花费了近5万元，于是小明回来就找组长报销费用，组长一看是笔不小的数目，他没权限审批，
 * 于是组长就拿去找部门主管报销，主管一看要报这么多钱，自己权限内只能批5千以下的费用，完全超出了自己的
 * 权限范围，于是主管又跑去找经理，经理一看二话不说直接拿着票据奔向了老板的办公室，因为经理他也只能批1
 * 万一下的费用。
 */
public abstract class AbstractHandlerLeader {

    /*上一级领导处理者*/
    public AbstractHandlerLeader next;

    /**
     * 报销处理请求
     *
     * @param money 具体要报销的金额
     */
    public final String handleRequest(int money) {
        if (money <= limit()) {
            return handle(money);
        } else {
            if (null != next) {
                return next.handleRequest(money);
            }
        }
        return handleRequest(money);
    }

    /**
     * 自身能报销的额度权限
     *
     * @return 额度
     */
    public abstract int limit();

    /**
     * 处理报销行为
     *
     * @param money 具体金额
     * @return
     */
    public abstract String handle(int money);
}
