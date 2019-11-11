package com.luffy.generaldesignmodelib.behavior.interpreterMode.terminalExpression;


import com.luffy.generaldesignmodelib.behavior.interpreterMode.abstractExpression.AbstractExpressionArithmetic;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 解释器模式~终结符表达式~数字
 */
public class TerminalExpressionNum implements AbstractExpressionArithmetic {

    private int num;

    public TerminalExpressionNum(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
