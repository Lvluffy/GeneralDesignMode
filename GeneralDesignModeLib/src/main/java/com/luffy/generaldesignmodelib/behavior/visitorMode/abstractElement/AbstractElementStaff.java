package com.luffy.generaldesignmodelib.behavior.visitorMode.abstractElement;


import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractVisitor.ObstractVisitor;

import java.util.Random;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 访问者模式~抽象元素~员工
 */
public abstract class AbstractElementStaff {
    /*姓名*/
    public String name;
    /*关键业绩指标*/
    public int kpi;

    public AbstractElementStaff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    /**
     * 接受
     *
     * @param obstractVisitor
     * @return
     */
    public abstract String accept(ObstractVisitor obstractVisitor);
}
