package com.luffy.generaldesignmodelib.structure.flyweightMode.flyweightFactory;

import com.luffy.generaldesignmodelib.structure.flyweightMode.abstractFlyweight.AbstractFlyweigetTicket;
import com.luffy.generaldesignmodelib.structure.flyweightMode.concreteFlyweight.ConcreteFlyweightTicket;

import java.util.HashMap;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 享元模式~享元工厂(负责创建和管理享元角色)~票
 * <p/>
 * 车票工厂，以出发地和目的地为Key缓存车票
 */
public class FlyweightFactoryTicket {

    static HashMap<String, AbstractFlyweigetTicket> flyweights = new HashMap<>();

    /**
     * 获取火车票
     *
     * @param from 出发地
     * @param to   目的地
     * @return
     */
    public AbstractFlyweigetTicket getTicket(String from, String to) {
        AbstractFlyweigetTicket mAbstractFlyweigetTicket = flyweights.get(from + "-" + to);
        if (mAbstractFlyweigetTicket != null) {
            return mAbstractFlyweigetTicket;
        } else {
            mAbstractFlyweigetTicket = new ConcreteFlyweightTicket(from, to);
            flyweights.put(from + "-" + to, mAbstractFlyweigetTicket);
        }
        return mAbstractFlyweigetTicket;
    }
}
