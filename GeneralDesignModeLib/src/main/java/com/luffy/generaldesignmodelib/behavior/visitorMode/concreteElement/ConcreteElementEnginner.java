package com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement;


import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractElement.AbstractElementStaff;
import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractVisitor.ObstractVisitor;

import java.util.Random;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 访问者模式~具体元素~工程师
 */
public class ConcreteElementEnginner extends AbstractElementStaff {

    public ConcreteElementEnginner(String name) {
        super(name);
    }

    /**
     * 接受
     *
     * @param obstractVisitor
     * @return
     */
    @Override
    public String accept(ObstractVisitor obstractVisitor) {
        return obstractVisitor.visit(this);
    }


    /**
     * 工程师这一年写的代码量
     *
     * @return
     */
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
