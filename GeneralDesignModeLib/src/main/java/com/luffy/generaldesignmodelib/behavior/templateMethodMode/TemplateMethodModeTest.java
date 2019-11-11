package com.luffy.generaldesignmodelib.behavior.templateMethodMode;


import com.luffy.generaldesignmodelib.behavior.templateMethodMode.abstractClass.AbsComputer;
import com.luffy.generaldesignmodelib.behavior.templateMethodMode.concreteClass.CoderComputer;
import com.luffy.generaldesignmodelib.behavior.templateMethodMode.concreteClass.MilitaryComputer;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 模块方法模式~测试
 * @desc
 */
public class TemplateMethodModeTest {

    public static String testTemplateMethodMode() {
        /*创建程序猿计算机*/
        AbsComputer computerCoder = new CoderComputer();
        /*创建军用计算机*/
        AbsComputer computerMilitary = new MilitaryComputer();
        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(computerCoder.execute());
        stringBuffer.append(computerMilitary.execute());
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testTemplateMethodMode());
    }
}
