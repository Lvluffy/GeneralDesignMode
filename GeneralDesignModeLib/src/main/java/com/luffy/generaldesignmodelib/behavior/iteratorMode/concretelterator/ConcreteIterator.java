package com.luffy.generaldesignmodelib.behavior.iteratorMode.concretelterator;

import com.luffy.generaldesignmodelib.behavior.iteratorMode.abstractIterator.AbstractIterator;
import com.luffy.generaldesignmodelib.behavior.iteratorMode.bean.Employee;

import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 迭代器模式~具体迭代器
 */
public class ConcreteIterator implements AbstractIterator {

    private List<Employee> list;

    private int position = 0;

    /**
     * 构造函数
     *
     * @param list
     */
    public ConcreteIterator(List<Employee> list) {
        this.list = list;
    }

    /**
     * 是否还有下一个元素
     *
     * @return true:表示有；false:表示没有
     */
    @Override
    public boolean hasNext() {
        return position != list.size();
    }

    /**
     * 返回当前位置的元素，并将位置移至下一位
     *
     * @return
     */
    @Override
    public Object next() {
        Employee employee = null;
        if (this.hasNext()) {
            employee = this.list.get(position);
            position++;
        }
        return employee;
    }
}
