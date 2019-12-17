package com.luffy.generaldesignmodelib.structure.decoratorMode.concreteDecorator;


import com.luffy.generaldesignmodelib.structure.decoratorMode.abstractComponent.Person;
import com.luffy.generaldesignmodelib.structure.decoratorMode.abstractDecorator.Dress;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 装饰模式~具体装饰~衣服~昂贵的
 * @desc
 */
public class ExpensiveDress extends Dress {
    /**
     * 构造函数
     *
     * @param person
     */
    public ExpensiveDress(Person person) {
        super(person);
    }

    /**
     * 穿短袖
     *
     * @return
     */
    private String dressShirt() {
        return "、短袖";
    }

    /**
     * 穿皮衣
     *
     * @return
     */
    private String dressLeather() {
        return "、皮衣";
    }

    /**
     * 穿牛仔裤
     *
     * @return
     */
    private String dressJean() {
        return "、牛仔裤";
    }

    @Override
    public String dressed() {
        String s = super.dressed() +
                dressShirt() +
                dressLeather() +
                dressJean() +
                "\n";
        return s;
    }
}
