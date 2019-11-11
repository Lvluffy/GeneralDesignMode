package com.luffy.generaldesignmodelib.create.builderMode.builder;


import com.luffy.generaldesignmodelib.create.builderMode.product.MacbookProduct;
import com.luffy.generaldesignmodelib.create.builderMode.product.Product;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 具体-构建者
 */
public class MacbookBuilder extends Builder {

    private Product mProduct = new MacbookProduct();

    /**
     * 设置主机
     *
     * @param board
     */
    @Override
    public void buildBoard(String board) {
        mProduct.setmBoard(board);
    }

    /**
     * 设置操作系统
     *
     * @param os
     */
    @Override
    public void buildOS(String os) {
        mProduct.setmOS(os);
    }

    /**
     * 设置显示器
     *
     * @param display
     */
    @Override
    public void buildDisplay(String display) {
        mProduct.setmDisplay(display);
    }

    /**
     * 创建计算机
     *
     * @return
     */
    @Override
    public Product create() {
        return mProduct;
    }
}
