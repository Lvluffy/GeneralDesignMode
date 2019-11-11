package com.luffy.generaldesignmodelib.structure.decoratorMode.abstractDecorator;


import com.luffy.generaldesignmodelib.structure.decoratorMode.abstractComponent.Person;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 装饰模式~抽象装饰角色～衣服
 * @desc
 */
public abstract class Dress extends Person {

    /**
     * 持有一个Person对象的引用
     */
    public Person mPerson;

    /**
     * 构造函数
     *
     * @param person
     */
    public Dress(Person person) {
        mPerson = person;
    }

    /**
     * 穿着的方法
     *
     * @return
     */
    @Override
    public String dressed() {
        return mPerson.dressed();
    }
}
