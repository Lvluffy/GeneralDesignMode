package com.luffy.generaldesignmode.ui.manager;

import com.luffy.generaldesignmode.R;
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
 * 开发模式~结构型模式~管理类（7种）
 */
public enum DesignModeTypeStructureManager {

    /*适配器模式*/
    AdapterMode(0, R.string.ui_test_adapter_mode, AdapterModeActivity.class),
    /*装饰模式*/
    DecoratorMode(1, R.string.ui_test_decorator_mode, DecoratorModeActivity.class),
    /*代理模式*/
    ProxyMode(2, R.string.ui_test_proxy_mode, ProxyModeActivity.class),
    /*外观模式*/
    FacadeMode(3, R.string.ui_test_facade_mode, FacadeModeActivity.class),
    /*桥接模式*/
    BridgeMode(4, R.string.ui_test_bridge_mode, BridgeModeActivity.class),
    /*组合模式*/
    CompositeMode(5, R.string.ui_test_composite_mode, CompositeModeActivity.class),
    /*享元模式*/
    FlyweightMode(6, R.string.ui_test_flyweight_mode, FlyweightModeActivity.class);

    private int id;
    private int name;
    private Class<?> clz;

    DesignModeTypeStructureManager(int id, int name, Class<?> clz) {
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
