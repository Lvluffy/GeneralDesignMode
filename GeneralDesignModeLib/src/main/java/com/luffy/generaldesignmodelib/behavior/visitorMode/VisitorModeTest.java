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
        String s = "-----给CEO看的报表-----\n" +
                businessReport.showReport(new ConcreteVisitorCEO()) + "\n" +
                "-----给CTO看的报表-----\n" +
                businessReport.showReport(new ConcreteVisitorCTO());
        return s;
    }

    public static void main(String[] args) {
        System.out.println(testVisitorMode());
    }
}
