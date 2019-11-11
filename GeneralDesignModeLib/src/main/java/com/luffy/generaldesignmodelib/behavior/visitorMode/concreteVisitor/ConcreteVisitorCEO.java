package com.luffy.generaldesignmodelib.behavior.visitorMode.concreteVisitor;


import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractVisitor.ObstractVisitor;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementEnginner;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementManager;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 访问者模式～具体访问者～CEO（只关注业绩）
 * <p/>
 * CEO只关注Enginner员工的KPI,而对于Manager类型的员工除了KPI之外还有该Manager本年度新开发产品的数量。
 */
public class ConcreteVisitorCEO implements ObstractVisitor {
    /**
     * 访问经理
     *
     * @param concreteElementManager
     * @return
     */
    @Override
    public String visit(ConcreteElementManager concreteElementManager) {
        return "经理：" + concreteElementManager.name + ",KPI:" + concreteElementManager.kpi + ",新产品数量：" + concreteElementManager.getProducts();
    }

    /**
     * 访问工程师
     *
     * @param concreteElementEnginner
     * @return
     */
    @Override
    public String visit(ConcreteElementEnginner concreteElementEnginner) {
        return "工程师：" + concreteElementEnginner.name + ",KPI:" + concreteElementEnginner.kpi;
    }
}
