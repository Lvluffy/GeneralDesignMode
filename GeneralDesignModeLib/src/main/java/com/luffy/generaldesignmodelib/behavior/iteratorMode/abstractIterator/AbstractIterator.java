package com.luffy.generaldesignmodelib.behavior.iteratorMode.abstractIterator;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 迭代器模式~抽象迭代器
 */
public interface AbstractIterator<T> {
    /**
     * 是否还有下一个元素
     *
     * @return true:表示有；false:表示没有
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素，并将位置移至下一位
     *
     * @return
     */
    T next();
}
