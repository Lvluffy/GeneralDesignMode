package com.luffy.generaldesignmodelib.structure.adapterMode.adaptee;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 适配器模式~适配者
 */
public class Adaptee {

    /**
     * 具体的请求-需要适配的电压
     *
     * @return
     */
    public int specificRequest() {
        return 220;
    }
}
