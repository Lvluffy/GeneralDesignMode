package com.luffy.generaldesignmodelib.structure.adapterMode;

import com.luffy.generaldesignmodelib.structure.adapterMode.adaptee.Adaptee;
import com.luffy.generaldesignmodelib.structure.adapterMode.adapter.Adapter;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 适配模式~测试
 * @desc
 */
public class AdapterModeTest {
    public static String testAdapterMode() {
        /*创建一个需要适配的对象*/
        Adaptee adaptee = new Adaptee();
        /*创建一个适配器对象*/
        Adapter adapter = new Adapter(adaptee);
        /*组装数据*/
        String s = "需要适配的电压：" + adapter.getAdapteeVolt() + "V\n" +
                "输出电压：" + adapter.request() + "V";
        return s;
    }

    public static void main(String[] args) {
        System.out.print(testAdapterMode());
    }
}
