package com.luffy.generaldesignmodelib.behavior.interpreterMode;


import com.luffy.generaldesignmodelib.behavior.interpreterMode.context.Calculator;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 解释器模式~测试
 * @desc
 */
public class InterpreterModeTest {

    public static String testInterpreterMode() {
        /*构建解释器模式~处理与解释相关的一些逻辑（计算器）对象*/
        String expression = "123 + 456 + 789 - 368";
        Calculator calculator = new Calculator(expression);
        String s = expression + " = " +
                calculator.calculate();
        return s;
    }

    public static void main(String[] args) {
        System.out.println(testInterpreterMode());
    }
}
