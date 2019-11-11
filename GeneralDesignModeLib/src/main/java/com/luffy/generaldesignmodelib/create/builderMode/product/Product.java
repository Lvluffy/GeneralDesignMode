package com.luffy.generaldesignmodelib.create.builderMode.product;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 抽象的~产品类
 */
public abstract class Product {
    /*主机*/
    String mBoard;

    /*操作系统*/
    String mOS;

    /*显示器*/
    String mDisplay;

    public Product() {
    }

    public abstract void setmBoard(String board);

    public abstract void setmOS(String os);

    public abstract void setmDisplay(String display);

    @Override
    public String toString() {
        return "Computer [mBoard=" + mBoard + ",mOS=" + mOS + ",mDisplay=" + mDisplay + "]";
    }
}
