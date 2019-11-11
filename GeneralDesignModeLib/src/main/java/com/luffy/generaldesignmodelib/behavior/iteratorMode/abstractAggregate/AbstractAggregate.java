package com.luffy.generaldesignmodelib.behavior.iteratorMode.abstractAggregate;

import com.luffy.generaldesignmodelib.behavior.iteratorMode.abstractIterator.AbstractIterator;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 迭代器模式~抽象聚合
 */
public interface AbstractAggregate<T> {
    /**
     * 添加一个元素
     *
     * @param obj 元素对象
     */
    void add(T obj);

    /**
     * 移除一个元素
     *
     * @param obj 元素对象
     */
    void remove(T obj);

    /**
     * 获取容器的迭代器
     *
     * @return 迭代器对象
     */
    AbstractIterator<T> iterator();
}
