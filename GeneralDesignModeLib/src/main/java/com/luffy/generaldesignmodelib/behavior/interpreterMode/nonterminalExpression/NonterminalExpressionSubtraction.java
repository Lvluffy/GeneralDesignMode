package com.luffy.generaldesignmodelib.behavior.interpreterMode.nonterminalExpression;

import com.luffy.generaldesignmodelib.behavior.interpreterMode.abstractExpression.AbstractExpressionArithmetic;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 解释器解释器模式~非终结符表达式~减法运算
 */
public class NonterminalExpressionSubtraction extends NonterminalExpressionOperator {
    /**
     * 构造函数
     *
     * @param exp1
     * @param exp2
     */
    public NonterminalExpressionSubtraction(AbstractExpressionArithmetic exp1, AbstractExpressionArithmetic exp2) {
        super(exp1, exp2);
    }

    /**
     * 抽象的解析方法
     * <p/>
     * 具体的解析逻辑有具体的子类实现
     *
     * @return
     */
    @Override
    public int interpret() {
        return exp1.interpret() - exp2.interpret();
    }
}
