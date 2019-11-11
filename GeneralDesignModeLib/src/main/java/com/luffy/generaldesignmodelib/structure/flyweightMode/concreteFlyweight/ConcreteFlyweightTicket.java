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
        StringBuilder mStringBuilder = new StringBuilder();
        mStringBuilder.append("购买从")
                .append(from)
                .append("到")
                .append(to)
                .append("的")
                .append(ticketInfo.getBunk())
                .append("火车票，价格：")
                .append(ticketInfo.getPrice())
                .append("元");
        return mStringBuilder.toString();
    }

}
