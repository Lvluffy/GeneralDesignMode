package com.luffy.generaldesignmodelib.behavior.stateMode.stateContext;


import com.luffy.generaldesignmodelib.behavior.stateMode.abstractState.AbstractStatePower;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 状态模式~状态环境~电源
 */
public class StateContextPower {

    AbstractStatePower abstractStatePower;

    public void setAbstractStatePower(AbstractStatePower abstractStatePower) {
        this.abstractStatePower = abstractStatePower;
    }

    /**
     * 电源打开
     *
     * @return
     */
    public String powerOn() {
        return abstractStatePower.powerOn();
    }

    /**
     * 电源关闭
     *
     * @return
     */
    public String powerOff() {
        return abstractStatePower.powerOff();
    }
}
