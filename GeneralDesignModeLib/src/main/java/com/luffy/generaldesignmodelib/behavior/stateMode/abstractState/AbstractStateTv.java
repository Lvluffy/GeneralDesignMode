package com.luffy.generaldesignmodelib.behavior.stateMode.abstractState;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 状态模式~抽象状态~电视
 * <p>
 * 案例：
 * 《电视遥控器》电视的状态分为两种开机状态和关机状态，
 * 在开机状态下频道切换、调整音量、关机操作可以进行，但是，此时重复按开机键是无效的；
 * 在关机状态下，频道切换、调整音量、关机操作都是无效的，只有按开机按钮时才会生效。
 */
public abstract class AbstractStateTv {

    /**
     * 下一频道
     *
     * @return
     */
    public abstract String nextChannal();

    /**
     * 上一频道
     *
     * @return
     */
    public abstract String prevChannal();

    /**
     * 调高音量
     *
     * @return
     */
    public abstract String turnUp();

    /**
     * 调低音量
     *
     * @return
     */
    public abstract String turnDown();
}
