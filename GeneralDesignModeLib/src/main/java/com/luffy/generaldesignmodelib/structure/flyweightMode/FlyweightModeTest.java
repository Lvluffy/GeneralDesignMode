package com.luffy.generaldesignmodelib.structure.flyweightMode;

import com.luffy.generaldesignmodelib.structure.flyweightMode.abstractFlyweight.AbstractFlyweigetTicket;
import com.luffy.generaldesignmodelib.structure.flyweightMode.flyweightFactory.FlyweightFactoryTicket;
import com.luffy.generaldesignmodelib.structure.flyweightMode.unsharableFlyweight.UnsharedConcreteFlyweightTicket;

import java.util.Random;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 享元模式~测试
 * @desc
 */
public class FlyweightModeTest {

    public static String testFlyweightMode() {
        /*创建享元工厂*/
        FlyweightFactoryTicket factoryTicket = new FlyweightFactoryTicket();
        /*创建具体享元*/
        AbstractFlyweigetTicket ticket1 = factoryTicket.getTicket("上海", "北京");
        AbstractFlyweigetTicket ticket2 = factoryTicket.getTicket("北京", "上海");
        AbstractFlyweigetTicket ticket3 = factoryTicket.getTicket("北京", "天津");
        /*组装数据*/
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ticket1.operation(new UnsharedConcreteFlyweightTicket("硬卧", new Random().nextInt(300)))).append("\n");
        stringBuilder.append(ticket2.operation(new UnsharedConcreteFlyweightTicket("软卧", new Random().nextInt(300)))).append("\n");
        stringBuilder.append(ticket3.operation(new UnsharedConcreteFlyweightTicket("硬座", new Random().nextInt(300)))).append("\n");
        stringBuilder.append(ticket3.operation(new UnsharedConcreteFlyweightTicket("软座", new Random().nextInt(300)))).append("\n");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.print(testFlyweightMode());
    }
}
