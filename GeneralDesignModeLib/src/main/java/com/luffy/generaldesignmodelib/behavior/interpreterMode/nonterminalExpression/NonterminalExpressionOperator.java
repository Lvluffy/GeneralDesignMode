package com.luffy.generaldesignmodelib.behavior.interpreterMode.nonterminalExpression;

import com.luffy.generaldesignmodelib.behavior.interpreterMode.abstractExpression.AbstractExpressionArithmetic;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 解释器模式～非终结符表达式~运算符
 * <p>
 * 抽象表达式的子类，用来实现文法中与非终结符相关的操作，文法中的每条规则都对应于一个非终结符表达式。
 */
public abstract class NonterminalExpressionOperator implements AbstractExpressionArithmetic {

    /*声明两个成员变量，存储运算符号两边的数字解释器*/
    protected AbstractExpressionArithmetic exp1;
    protected AbstractExpressionArithmetic exp2;

    public NonterminalExpressionOperator(AbstractExpressionArithmetic exp1, AbstractExpressionArithmetic exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
