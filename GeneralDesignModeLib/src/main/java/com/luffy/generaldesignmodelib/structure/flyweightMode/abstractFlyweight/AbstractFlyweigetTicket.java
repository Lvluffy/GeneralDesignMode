package com.luffy.generaldesignmodelib.structure.flyweightMode.abstractFlyweight;


import com.luffy.generaldesignmodelib.structure.flyweightMode.unsharableFlyweight.UnsharedConcreteFlyweightTicket;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 享元模式~抽象享元~票
 */
public interface AbstractFlyweigetTicket {
    /**
     * @param ticketInfo 票信息
     * @return
     */
    String operation(UnsharedConcreteFlyweightTicket ticketInfo);
}
