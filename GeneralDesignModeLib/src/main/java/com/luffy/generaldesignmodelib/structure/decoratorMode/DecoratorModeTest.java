package com.luffy.generaldesignmodelib.structure.decoratorMode;

import com.luffy.generaldesignmodelib.structure.decoratorMode.abstractComponent.Person;
import com.luffy.generaldesignmodelib.structure.decoratorMode.concreteComponent.Boy;
import com.luffy.generaldesignmodelib.structure.decoratorMode.concreteDecorator.CheapDress;
import com.luffy.generaldesignmodelib.structure.decoratorMode.concreteDecorator.ExpensiveDress;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 装饰模式～测试
 * @desc
 */
public class DecoratorModeTest {

    public static String testDecoratorMode() {
        /*创建一个Person类(小明)*/
        Person xiaoMing = new Boy("小明");
        /*给小明穿上便宜的衣服*/
        CheapDress cheapDress = new CheapDress(xiaoMing);

        /*创建一个Person类(小亮)*/
        Person xiaoLiang = new Boy("小亮");
        /*给小亮穿上昂贵的衣服*/
        ExpensiveDress expensiveDress = new ExpensiveDress(xiaoLiang);

        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cheapDress.dressed());
        stringBuffer.append("---------------\n");
        stringBuffer.append(expensiveDress.dressed());
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.print(testDecoratorMode());
    }
}
