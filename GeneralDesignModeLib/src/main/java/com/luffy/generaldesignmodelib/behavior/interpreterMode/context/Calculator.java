package com.luffy.generaldesignmodelib.behavior.interpreterMode.context;

import com.luffy.generaldesignmodelib.behavior.interpreterMode.abstractExpression.AbstractExpressionArithmetic;
import com.luffy.generaldesignmodelib.behavior.interpreterMode.nonterminalExpression.NonterminalExpressionAddition;
import com.luffy.generaldesignmodelib.behavior.interpreterMode.nonterminalExpression.NonterminalExpressionSubtraction;
import com.luffy.generaldesignmodelib.behavior.interpreterMode.terminalExpression.TerminalExpressionNum;

import java.util.Stack;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 解释器模式～环境～计算器
 * <p>
 * 通常包含各个解释器需要的数据或是公共的功能，一般用来传递被所有解释器共享的数据，后面的解释器可以从这里获取这些值。
 */
public class Calculator {

    /**
     * 声明一个Stack栈存储并操作所有相关的解释器
     */
    private Stack<AbstractExpressionArithmetic> abstractExpressionArithmetics = new Stack<>();

    /**
     * 构造函数
     *
     * @param expression 表达式
     */
    public Calculator(String expression) {
        /*声明两个AbstractExpressionArithmetic类型的临时变量，存储运算符左右两边的数字解释器*/
        AbstractExpressionArithmetic exp1;
        AbstractExpressionArithmetic exp2;

        /*根据空格分隔表达式字符串*/
        String[] elements = expression.split(" ");

        /*循环遍历表达式元素数组*/
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                /*加号*/
                case '+':
                    /*将栈中的解释器弹出作为运算符号左边的解释器*/
                    exp1 = abstractExpressionArithmetics.pop();
                    /*将运算符号数组下标下一个元素构造为一个数字解释器*/
                    exp2 = new TerminalExpressionNum(Integer.valueOf(elements[++i]));
                    /*通过上面两个数字解释器构造加法运算符*/
                    abstractExpressionArithmetics.push(new NonterminalExpressionAddition(exp1, exp2));
                    break;
                /*减号*/
                case '-':
                    /*将栈中的解释器弹出作为运算符号左边的解释器*/
                    exp1 = abstractExpressionArithmetics.pop();
                    /*将运算符号数组下标下一个元素构造为一个数字解释器*/
                    exp2 = new TerminalExpressionNum(Integer.valueOf(elements[++i]));
                    /*通过上面两个数字解释器构造减法运算符*/
                    abstractExpressionArithmetics.push(new NonterminalExpressionSubtraction(exp1, exp2));
                    break;
                /*数字*/
                default:
                    /*直接构造数字解释器并压入栈*/
                    abstractExpressionArithmetics.push(new TerminalExpressionNum(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    /**
     * 计算结果
     *
     * @return
     */
    public int calculate() {
        return abstractExpressionArithmetics.pop().interpret();
    }
}
