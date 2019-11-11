package com.luffy.generaldesignmode.ui.manager;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.ui.behavior.CommandModeActivity;
import com.luffy.generaldesignmode.ui.behavior.InterpreterModeActivity;
import com.luffy.generaldesignmode.ui.behavior.IteratorModeActivity;
import com.luffy.generaldesignmode.ui.behavior.MediatorModeActivity;
import com.luffy.generaldesignmode.ui.behavior.MementoModeActivity;
import com.luffy.generaldesignmode.ui.behavior.ObserverModeActivity;
import com.luffy.generaldesignmode.ui.behavior.ResponsibilityModeActivity;
import com.luffy.generaldesignmode.ui.behavior.StateModeActivity;
import com.luffy.generaldesignmode.ui.behavior.StragetyModeActivity;
import com.luffy.generaldesignmode.ui.behavior.TemplateMrthodModeActivity;
import com.luffy.generaldesignmode.ui.behavior.VisitorModeActivity;
import com.luffy.generaldesignmode.ui.create.AbstractFactoryModeActivity;
import com.luffy.generaldesignmode.ui.create.BuilderModeActivity;
import com.luffy.generaldesignmode.ui.create.FactoryModeActivity;
import com.luffy.generaldesignmode.ui.create.PrototypeModeActivity;
import com.luffy.generaldesignmode.ui.create.SingletonModeActivity;
import com.luffy.generaldesignmode.ui.structure.AdapterModeActivity;
import com.luffy.generaldesignmode.ui.structure.BridgeModeActivity;
import com.luffy.generaldesignmode.ui.structure.CompositeModeActivity;
import com.luffy.generaldesignmode.ui.structure.DecoratorModeActivity;
import com.luffy.generaldesignmode.ui.structure.FacadeModeActivity;
import com.luffy.generaldesignmode.ui.structure.FlyweightModeActivity;
import com.luffy.generaldesignmode.ui.structure.ProxyModeActivity;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 开发模式管理类
 */
public enum DesignModeTypeAllManager {

    /**
     * 创建型
     */
    /*工厂方法模式*/
    FactoryMode(0, R.string.ui_test_factory_mode, FactoryModeActivity.class),
    /*抽象工厂模式*/
    AbstractFactoryMode(1, R.string.ui_test_abstract_factory_mode, AbstractFactoryModeActivity.class),
    /*单例模式*/
    SingletonMode(2, R.string.ui_test_singleton_mode, SingletonModeActivity.class),
    /*构建者模式*/
    BuilderMode(3, R.string.ui_test_builder_mode, BuilderModeActivity.class),
    /*原型模式*/
    PrototypeMode(4, R.string.ui_test_prototype_mode, PrototypeModeActivity.class),

    /**
     * 结构型
     */
    /*适配器模式*/
    AdapterMode(5, R.string.ui_test_adapter_mode, AdapterModeActivity.class),
    /*装饰模式*/
    DecoratorMode(6, R.string.ui_test_decorator_mode, DecoratorModeActivity.class),
    /*代理模式*/
    ProxyMode(7, R.string.ui_test_proxy_mode, ProxyModeActivity.class),
    /*外观模式*/
    FacadeMode(8, R.string.ui_test_facade_mode, FacadeModeActivity.class),
    /*桥接模式*/
    BridgeMode(9, R.string.ui_test_bridge_mode, BridgeModeActivity.class),
    /*组合模式*/
    CompositeMode(10, R.string.ui_test_composite_mode, CompositeModeActivity.class),
    /*享元模式*/
    FlyweightMode(11, R.string.ui_test_flyweight_mode, FlyweightModeActivity.class),

    /**
     * 行为型
     */
    /*策略模式*/
    StragetyMode(12, R.string.ui_test_stragety_mode, StragetyModeActivity.class),
    /*模块方法模式*/
    TemplateMethodMode(13, R.string.ui_test_template_method_mode, TemplateMrthodModeActivity.class),
    /*观察者模式*/
    ObserverMode(14, R.string.ui_test_observer_mode, ObserverModeActivity.class),
    /*迭代器模式*/
    IteratorCursoroMode(15, R.string.ui_test_iterator_cursor_mode, IteratorModeActivity.class),
    /*责任链模式*/
    IteratorMode(16, R.string.ui_test_iterator_mode, ResponsibilityModeActivity.class),
    /*命令模式*/
    CommandMode(17, R.string.ui_test_command_mode, CommandModeActivity.class),
    /*备忘录模式*/
    MementoMode(18, R.string.ui_test_memento_mode, MementoModeActivity.class),
    /*状态模式*/
    StateMode(19, R.string.ui_test_state_mode, StateModeActivity.class),
    /*访问者模式*/
    VisitorMode(20, R.string.ui_test_visitor_mode, VisitorModeActivity.class),
    /*中介者模式*/
    MediatorMode(21, R.string.ui_test_mediator_mode, MediatorModeActivity.class),
    /*解释器模式*/
    InterpreterMode(22, R.string.ui_test_interpreter_mode, InterpreterModeActivity.class);


    private int id;
    private int name;
    private Class<?> clz;

    DesignModeTypeAllManager(int id, int name, Class<?> clz) {
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
