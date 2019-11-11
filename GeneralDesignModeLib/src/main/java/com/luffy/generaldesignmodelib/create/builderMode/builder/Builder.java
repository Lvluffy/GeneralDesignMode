package com.luffy.generaldesignmodelib.create.builderMode.builder;


import com.luffy.generaldesignmodelib.create.builderMode.product.Product;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象-建造者
 */
public abstract class Builder {

    /**
     * 设置主机
     *
     * @param board
     */
    public abstract void buildBoard(String board);

    /**
     * 设置操作系统
     *
     * @param os
     */
    public abstract void buildOS(String os);

    /**
     * 设置显示器
     *
     * @param display
     */
    public abstract void buildDisplay(String display);

    /**
     * 创建计算机
     *
     * @return
     */
    public abstract Product create();
}
