package com.luffy.generaldesignmodelib.behavior.stateMode.concreteState;


import com.luffy.generaldesignmodelib.behavior.stateMode.abstractState.AbstractStateTv;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 状态模式~具体状态~开机
 */
public class ConcreteStateTvOn extends AbstractStateTv {
    @Override
    public String nextChannal() {
        return "开机状态，下一频道-已切换";
    }

    @Override
    public String prevChannal() {
        return "开机状态，上一频道-已切换";
    }

    @Override
    public String turnUp() {
        return "开机状态，调高音量-已切换";
    }

    @Override
    public String turnDown() {
        return "开机状态，调低音量-已切换";
    }
}
