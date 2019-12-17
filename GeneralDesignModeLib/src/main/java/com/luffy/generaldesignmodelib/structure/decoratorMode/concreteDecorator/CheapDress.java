package com.luffy.generaldesignmodelib.structure.decoratorMode.concreteDecorator;


import com.luffy.generaldesignmodelib.structure.decoratorMode.abstractComponent.Person;
import com.luffy.generaldesignmodelib.structure.decoratorMode.abstractDecorator.Dress;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 装饰模式~具体装饰~衣服~廉价的
 * @desc
 */
public class CheapDress extends Dress {

    /**
     * 构造函数
     *
     * @param person
     */
    public CheapDress(Person person) {
        super(person);
    }

    /**
     * 穿短裤
     *
     * @return
     */
    private String dressShorts() {
        return "、短裤";
    }

    @Override
    public String dressed() {
        String s = super.dressed() +
                dressShorts() +
                "\n";
        return s;
    }
}
