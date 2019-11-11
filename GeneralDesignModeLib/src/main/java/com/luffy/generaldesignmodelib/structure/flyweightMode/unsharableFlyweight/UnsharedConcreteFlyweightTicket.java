package com.luffy.generaldesignmodelib.structure.flyweightMode.unsharableFlyweight;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 享元模式~非享元~票信息
 * @desc
 */
public class UnsharedConcreteFlyweightTicket {

    private String bunk;//床铺类型（1-硬卧；2-软卧；3-硬座；4-软座）
    private int price;//票价格

    public UnsharedConcreteFlyweightTicket(String bunk, int price) {
        this.bunk = bunk;
        this.price = price;
    }

    public String getBunk() {
        return bunk;
    }

    public void setBunk(String bunk) {
        this.bunk = bunk;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
