package com.luffy.generaldesignmodelib.behavior.stateMode;


import com.luffy.generaldesignmodelib.behavior.stateMode.concreteState.ConcreteStatePower;
import com.luffy.generaldesignmodelib.behavior.stateMode.concreteState.ConcreteStateTvOff;
import com.luffy.generaldesignmodelib.behavior.stateMode.concreteState.ConcreteStateTvOn;
import com.luffy.generaldesignmodelib.behavior.stateMode.stateContext.StateContextPower;
import com.luffy.generaldesignmodelib.behavior.stateMode.stateContext.StateContextTv;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 状态模式~测试
 * @desc
 */
public class StateModeTest {

    public static String testStateMode() {
        /*电源环境*/
        StateContextPower stateContextPower = new StateContextPower();
        stateContextPower.setAbstractStatePower(new ConcreteStatePower());
        /*电视环境-开机*/
        StateContextTv stateContextTvOn = new StateContextTv();
        stateContextTvOn.setAbstractStateTv(new ConcreteStateTvOn());
        /*电视环境-关机*/
        StateContextTv stateContextTvOff = new StateContextTv();
        stateContextTvOff.setAbstractStateTv(new ConcreteStateTvOff());
        /*组装数据*/
        //设置开机状态
        //上一频道
        //下一频道
        //调高音量
        //调低音量
        //设置关机状态
        //上一频道
        //下一频道
        //调高音量
        //调低音量
        String s = stateContextPower.powerOn() + "\n" +
                stateContextTvOn.prevChannal() + "\n" +
                stateContextTvOn.nextChannal() + "\n" +
                stateContextTvOn.turnUp() + "\n" +
                stateContextTvOn.turnDown() + "\n" +
                stateContextPower.powerOff() + "\n" +
                stateContextTvOff.prevChannal() + "\n" +
                stateContextTvOff.nextChannal() + "\n" +
                stateContextTvOff.turnUp() + "\n" +
                stateContextTvOff.turnDown() + "\n";
        return s;
    }

    public static void main(String[] args) {
        System.out.println(testStateMode());
    }
}
