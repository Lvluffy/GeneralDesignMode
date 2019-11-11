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

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 开发模式~行为型模式~管理类（11种）
 */
public enum DesignModeTypeBehaviorManager {

    /*策略模式*/
    StragetyMode(0, R.string.ui_test_stragety_mode, StragetyModeActivity.class),
    /*模块方法模式*/
    TemplateMethodMode(1, R.string.ui_test_template_method_mode, TemplateMrthodModeActivity.class),
    /*观察者模式*/
    ObserverMode(2, R.string.ui_test_observer_mode, ObserverModeActivity.class),
    /*迭代器模式*/
    IteratorCursoroMode(3, R.string.ui_test_iterator_cursor_mode, IteratorModeActivity.class),
    /*责任链模式*/
    IteratorMode(4, R.string.ui_test_iterator_mode, ResponsibilityModeActivity.class),
    /*命令模式*/
    CommandMode(5, R.string.ui_test_command_mode, CommandModeActivity.class),
    /*备忘录模式*/
    MementoMode(6, R.string.ui_test_memento_mode, MementoModeActivity.class),
    /*状态模式*/
    StateMode(7, R.string.ui_test_state_mode, StateModeActivity.class),
    /*访问者模式*/
    VisitorMode(8, R.string.ui_test_visitor_mode, VisitorModeActivity.class),
    /*中介者模式*/
    MediatorMode(9, R.string.ui_test_mediator_mode, MediatorModeActivity.class),
    /*解释器模式*/
    InterpreterMode(10, R.string.ui_test_interpreter_mode, InterpreterModeActivity.class);

    private int id;
    private int name;
    private Class<?> clz;

    DesignModeTypeBehaviorManager(int id, int name, Class<?> clz) {
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
