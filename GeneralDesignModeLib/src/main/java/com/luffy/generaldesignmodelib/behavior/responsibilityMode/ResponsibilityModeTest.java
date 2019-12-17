package com.luffy.generaldesignmodelib.behavior.responsibilityMode;


import com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler.AbstractHandlerLeaderBoss;
import com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler.AbstractHandlerLeaderDirector;
import com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler.AbstractHandlerLeaderGroup;
import com.luffy.generaldesignmodelib.behavior.responsibilityMode.concreteHandler.AbstractHandlerLeaderManager;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 责任链模式~测试
 * @desc
 */
public class ResponsibilityModeTest {

    public static String testResponsibilityMode() {
        StringBuilder stringBuilder = new StringBuilder();
        /*构建各个领导对象*/
        AbstractHandlerLeaderGroup group = new AbstractHandlerLeaderGroup();
        AbstractHandlerLeaderDirector director = new AbstractHandlerLeaderDirector();
        AbstractHandlerLeaderManager manager = new AbstractHandlerLeaderManager();
        AbstractHandlerLeaderBoss boss = new AbstractHandlerLeaderBoss();
        /*设置上一级领导处理者对象*/
        group.next = director;
        director.next = manager;
        manager.next = boss;
        /*发起报销申请*/
        stringBuilder.append(group.handleRequest(50000));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(testResponsibilityMode());
    }
}
