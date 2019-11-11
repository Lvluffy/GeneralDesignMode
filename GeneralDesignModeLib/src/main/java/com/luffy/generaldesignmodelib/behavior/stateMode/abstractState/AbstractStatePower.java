package com.luffy.generaldesignmodelib.behavior.stateMode.abstractState;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 状态模式~抽象状态~电源
 * <p/>
 * 电源控制器
 */
public abstract class AbstractStatePower {

    /**
     * 电源打开
     *
     * @return
     */
    public abstract String powerOn();

    /**
     * 电源关闭
     *
     * @return
     */
    public abstract String powerOff();
}
