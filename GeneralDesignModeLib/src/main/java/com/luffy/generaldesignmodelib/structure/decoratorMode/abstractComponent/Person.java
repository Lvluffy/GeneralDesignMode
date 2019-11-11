package com.luffy.generaldesignmodelib.structure.decoratorMode.abstractComponent;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 装饰模式~抽象组件角色～人
 * @desc 案例：就拿人来说，人需要各式各样的衣着，不管你穿着怎样，但是，对于个人的本质来说是不一样的，
 * 充其量只是在外面披上一层遮羞物而已，这就是装饰模式，装饰物也许各不相同，但是装饰物的对象本质
 * 是不变的。
 */
public abstract class Person {

    /**
     * 人的姓名
     */
    public String mName;

    /**
     * 穿着的方法
     *
     * @return
     */
    public abstract String dressed();

    /**
     * 获取人的姓名
     *
     * @return
     */
    public String getName() {
        return mName;
    }
}
