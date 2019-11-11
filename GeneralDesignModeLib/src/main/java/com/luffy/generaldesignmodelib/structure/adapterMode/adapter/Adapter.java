package com.luffy.generaldesignmodelib.structure.adapterMode.adapter;

import com.luffy.generaldesignmodelib.structure.adapterMode.adaptee.Adaptee;
import com.luffy.generaldesignmodelib.structure.adapterMode.target.Target;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 适配器模式~适配器（适配器把圆接口转换成目标接口）
 */
public class Adapter implements Target {

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int request() {
        return 5;
    }

    /**
     * 获取需要适配的电压
     *
     * @return
     */
    public int getAdapteeVolt() {
        return adaptee.specificRequest();
    }

}
