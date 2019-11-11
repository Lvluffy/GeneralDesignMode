package com.luffy.generaldesignmodelib.create.builderMode.director;


import com.luffy.generaldesignmodelib.create.builderMode.builder.Builder;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 指挥者（负责构建计算机）
 */
public class Director {
    /*建造者*/
    Builder mBuilder;

    /**
     * 构造函数
     *
     * @param builder
     */
    public Director(Builder builder) {
        mBuilder = builder;
    }

    /**
     * 构建计算机
     *
     * @param board   主机
     * @param os      操作系统
     * @param display 显示器
     */
    public void construct(String board, String os, String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildOS(os);
        mBuilder.buildDisplay(display);
    }
}
