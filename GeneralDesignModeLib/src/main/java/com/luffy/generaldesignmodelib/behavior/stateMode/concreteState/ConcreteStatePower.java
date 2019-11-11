package com.luffy.generaldesignmodelib.behavior.stateMode.concreteState;


import com.luffy.generaldesignmodelib.behavior.stateMode.abstractState.AbstractStatePower;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 状态模式~具体状态~电源
 */
public class ConcreteStatePower extends AbstractStatePower {

    @Override
    public String powerOn() {
        return "-----开机啦-----";
    }

    @Override
    public String powerOff() {
        return "-----关机啦-----";
    }

}
