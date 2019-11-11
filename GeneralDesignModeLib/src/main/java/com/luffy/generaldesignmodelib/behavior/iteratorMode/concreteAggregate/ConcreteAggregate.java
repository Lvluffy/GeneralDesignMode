package com.luffy.generaldesignmodelib.behavior.iteratorMode.concreteAggregate;

import com.luffy.generaldesignmodelib.behavior.iteratorMode.abstractAggregate.AbstractAggregate;
import com.luffy.generaldesignmodelib.behavior.iteratorMode.abstractIterator.AbstractIterator;
import com.luffy.generaldesignmodelib.behavior.iteratorMode.bean.Employee;
import com.luffy.generaldesignmodelib.behavior.iteratorMode.concretelterator.ConcreteIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 迭代器模式~具体聚合
 */
public class ConcreteAggregate implements AbstractAggregate {

    private List<Employee> list = new ArrayList<>();

    /**
     * 添加一个元素
     *
     * @param obj 元素对象
     */
    @Override
    public void add(Object obj) {
        list.add((Employee) obj);
    }

    /**
     * 移除一个元素
     *
     * @param obj 元素对象
     */
    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    /**
     * 获取容器的迭代器
     *
     * @return 迭代器对象
     */
    @Override
    public AbstractIterator iterator() {
        return new ConcreteIterator(list);
    }
}
