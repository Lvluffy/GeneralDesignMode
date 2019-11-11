package com.luffy.generaldesignmodelib.behavior.iteratorMode;

import com.luffy.generaldesignmodelib.behavior.iteratorMode.abstractIterator.AbstractIterator;
import com.luffy.generaldesignmodelib.behavior.iteratorMode.bean.Employee;
import com.luffy.generaldesignmodelib.behavior.iteratorMode.concreteAggregate.ConcreteAggregate;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 迭代器模式~测试
 * @desc
 */
public class IteratorModeTest {

    public static String testIteratorMode() {
        /*创建具体的容器*/
        ConcreteAggregate aggregateConcrete = new ConcreteAggregate();
        /*向容器中添加值*/
        aggregateConcrete.add(new Employee("小民", 63, "男", "程序猿"));
        aggregateConcrete.add(new Employee("小丽", 22, "女", "测试"));
        aggregateConcrete.add(new Employee("红红", 20, "女", "测试"));
        aggregateConcrete.add(new Employee("青儿", 21, "女", "设计"));
        aggregateConcrete.add(new Employee("倩倩", 19, "女", "设计"));
        /*从容器中获取迭代器*/
        AbstractIterator<Employee> abstractIterator = aggregateConcrete.iterator();
        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        while (abstractIterator.hasNext()) {
            stringBuffer.append(abstractIterator.next().toString() + "\n");
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testIteratorMode());
    }
}
