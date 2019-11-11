package com.luffy.generaldesignmode.ui.manager;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.ui.create.AbstractFactoryModeActivity;
import com.luffy.generaldesignmode.ui.create.BuilderModeActivity;
import com.luffy.generaldesignmode.ui.create.FactoryModeActivity;
import com.luffy.generaldesignmode.ui.create.PrototypeModeActivity;
import com.luffy.generaldesignmode.ui.create.SingletonModeActivity;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 开发模式~创建型模式~管理类（5种）
 */
public enum DesignModeTypeCreateManager {

    /*工厂方法模式*/
    FactoryMode(0, R.string.ui_test_factory_mode, FactoryModeActivity.class),
    /*抽象工厂模式*/
    AbstractFactoryMode(1, R.string.ui_test_abstract_factory_mode, AbstractFactoryModeActivity.class),
    /*单例模式*/
    SingletonMode(2, R.string.ui_test_singleton_mode, SingletonModeActivity.class),
    /*构建者模式*/
    BuilderMode(3, R.string.ui_test_builder_mode, BuilderModeActivity.class),
    /*原型模式*/
    PrototypeMode(4, R.string.ui_test_prototype_mode, PrototypeModeActivity.class);

    private int id;
    private int name;
    private Class<?> clz;

    DesignModeTypeCreateManager(int id, int name, Class<?> clz) {
        this.id = id;
        this.name = name;
        this.clz = clz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Class<?> getClz() {
        return clz;
    }

    public void setClz(Class<?> clz) {
        this.clz = clz;
    }
}
