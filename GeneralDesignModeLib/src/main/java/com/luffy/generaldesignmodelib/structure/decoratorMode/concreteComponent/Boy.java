package com.luffy.generaldesignmodelib.structure.decoratorMode.concreteComponent;


import com.luffy.generaldesignmodelib.structure.decoratorMode.abstractComponent.Person;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 装饰模式~具体构件～人～男孩
 * @desc
 */
public class Boy extends Person {
    /**
     * 构造函数
     *
     * @param name
     */
    public Boy(String name) {
        mName = name;
    }

    @Override
    public String dressed() {
        return getName() + "穿了内衣内裤";
    }
}
