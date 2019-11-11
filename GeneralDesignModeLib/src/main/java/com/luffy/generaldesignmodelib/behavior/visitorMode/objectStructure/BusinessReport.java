package com.luffy.generaldesignmodelib.behavior.visitorMode.objectStructure;


import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractElement.AbstractElementStaff;
import com.luffy.generaldesignmodelib.behavior.visitorMode.abstractVisitor.ObstractVisitor;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementEnginner;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteElement.ConcreteElementManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 访问者模式~对象结构~业务报告
 */
public class BusinessReport {

    List<AbstractElementStaff> abstractElementStaffs = new ArrayList<>();

    public BusinessReport() {
        abstractElementStaffs.add(new ConcreteElementManager("王经理"));
        abstractElementStaffs.add(new ConcreteElementEnginner("工程师—赵"));
        abstractElementStaffs.add(new ConcreteElementEnginner("工程师—钱"));
        abstractElementStaffs.add(new ConcreteElementEnginner("工程师—孙"));
        abstractElementStaffs.add(new ConcreteElementEnginner("工程师—李"));
    }

    /**
     * 为访问者显示报表
     *
     * @param obstractVisitor 公司高层：如CEO、CTO
     */
    public String showReport(ObstractVisitor obstractVisitor) {
        StringBuffer stringBuffer = new StringBuffer();
        for (AbstractElementStaff abstractElementStaff : abstractElementStaffs) {
            stringBuffer.append(abstractElementStaff.accept(obstractVisitor) + "\n");
        }
        return stringBuffer.toString();
    }
}
