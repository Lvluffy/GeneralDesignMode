package com.luffy.generaldesignmodelib.behavior.visitorMode.concreteVisitor;


import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractVisitor.ObstractVisitor;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementEnginner;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementManager;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 访问者模式～具体访问者～CTO（更关注员工在技术层面的贡献）
 */
public class ConcreteVisitorCTO implements ObstractVisitor {
    /**
     * 访问经理
     *
     * @param concreteElementManager
     * @return
     */
    @Override
    public String visit(ConcreteElementManager concreteElementManager) {
        return "经理："+ concreteElementManager.name+",新产品数量："+ concreteElementManager.getProducts();
    }

    /**
     * 访问工程师
     *
     * @param concreteElementEnginner
     * @return
     */
    @Override
    public String visit(ConcreteElementEnginner concreteElementEnginner) {
        return "工程师："+ concreteElementEnginner.name+",代码数量："+ concreteElementEnginner.getCodeLines();
    }
}
