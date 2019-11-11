package com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement;

import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractElement.AbstractElementStaff;
import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractVisitor.ObstractVisitor;

import java.util.Random;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 访问者模式~具体元素~经理
 */
public class ConcreteElementManager extends AbstractElementStaff {

    public ConcreteElementManager(String name) {
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
     * 经理一年内做的产品数量
     *
     * @return
     */
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
