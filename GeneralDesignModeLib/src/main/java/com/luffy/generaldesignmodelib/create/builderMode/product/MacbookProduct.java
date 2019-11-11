package com.luffy.generaldesignmodelib.create.builderMode.product;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 具体的~计算机类
 */
public class MacbookProduct extends Product {

    public MacbookProduct() {
    }

    @Override
    public void setmBoard(String board) {
        mBoard = board;
    }

    @Override
    public void setmOS(String os) {
        mOS = os;
    }

    @Override
    public void setmDisplay(String display) {
        mDisplay = display;
    }
}
