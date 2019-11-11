package com.luffy.generaldesignmodelib.behavior.interpreterMode.nonterminalExpression;

import com.luffy.generaldesignmodelib.behavior.interpreterMode.abstractExpression.AbstractExpressionArithmetic;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 解释器模式~非终结符表达式~加法运算
 */
public class NonterminalExpressionAddition extends NonterminalExpressionOperator {

    public NonterminalExpressionAddition(AbstractExpressionArithmetic exp1, AbstractExpressionArithmetic exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret() {
        return exp1.interpret() + exp2.interpret();
    }
}
