package com.luffy.generaldesignmodelib.structure.flyweightMode.concreteFlyweight;

import com.luffy.generaldesignmodelib.structure.flyweightMode.abstractFlyweight.AbstractFlyweigetTicket;
import com.luffy.generaldesignmodelib.structure.flyweightMode.unsharableFlyweight.UnsharedConcreteFlyweightTicket;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 享元模式~具体享元~票
 */
public class ConcreteFlyweightTicket implements AbstractFlyweigetTicket {

    /*出发地*/
    public String from;
    /*目的地*/
    public String to;

    public ConcreteFlyweightTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String operation(UnsharedConcreteFlyweightTicket ticketInfo) {
        String s = "购买从" +
                from +
                "到" +
                to +
                "的" +
                ticketInfo.getBunk() +
                "火车票，价格：" +
                ticketInfo.getPrice() +
                "元";
        return s;
    }

}
