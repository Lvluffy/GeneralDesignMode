package com.luffy.generaldesignmodelib.structure.adapterMode.target;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 适配器模式~目标接口(也就是所期待得到的接口)
 * <p/>
 * 案例：笔记本的电源一般是5V电压（目标电压），但是我们的生活中电线电压一般都是220V（需要适配的电压）。
 * 这个时候就出现了不匹配的状况，在软件开发中我们称之为接口不兼容，此时就
 * 需要适配器来进行一个接口转换。
 */
public interface Target {

    /**
     * 请求-目标电压
     *
     * @return
     */
    int request();
}
