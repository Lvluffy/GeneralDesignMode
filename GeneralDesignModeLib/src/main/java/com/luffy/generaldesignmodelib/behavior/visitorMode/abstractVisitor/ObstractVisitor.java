package com.luffy.generaldesignmodelib.behavior.visitorMode.abstractVisitor;


import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementEnginner;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementManager;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 访问者模式~抽象访问者
 */
public interface ObstractVisitor {

    /**
     * 访问经理
     *
     * @param concreteElementManager
     * @return
     */
    String visit(ConcreteElementManager concreteElementManager);

    /**
     * 访问工程师
     *
     * @param concreteElementEnginner
     * @return
     */
    String visit(ConcreteElementEnginner concreteElementEnginner);
}
