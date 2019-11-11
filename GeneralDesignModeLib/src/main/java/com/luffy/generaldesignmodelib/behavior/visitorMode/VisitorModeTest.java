package com.luffy.generaldesignmodelib.behavior.visitorMode;


import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteVisitor.ConcreteVisitorCEO;
import com.luffy.generaldesignmodelib.behavior.visitorMode.concreteVisitor.ConcreteVisitorCTO;
import com.luffy.generaldesignmodelib.behavior.visitorMode.objectStructure.BusinessReport;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 访问者模式~测试
 * @desc
 */
public class VisitorModeTest {

    public static String testVisitorMode() {
        /*创建报表*/
        BusinessReport businessReport = new BusinessReport();
        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("-----给CEO看的报表-----\n");
        stringBuffer.append(businessReport.showReport(new ConcreteVisitorCEO()) + "\n");
        stringBuffer.append("-----给CTO看的报表-----\n");
        stringBuffer.append(businessReport.showReport(new ConcreteVisitorCTO()));
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testVisitorMode());
    }
}
