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
        StringBuffer stringBuffer = new StringBuffer();
        //设置开机状态
        stringBuffer.append(stateContextPower.powerOn() + "\n");
        //上一频道
        stringBuffer.append(stateContextTvOn.prevChannal() + "\n");
        //下一频道
        stringBuffer.append(stateContextTvOn.nextChannal() + "\n");
        //调高音量
        stringBuffer.append(stateContextTvOn.turnUp() + "\n");
        //调低音量
        stringBuffer.append(stateContextTvOn.turnDown() + "\n");
        //设置关机状态
        stringBuffer.append(stateContextPower.powerOff() + "\n");
        //上一频道
        stringBuffer.append(stateContextTvOff.prevChannal() + "\n");
        //下一频道
        stringBuffer.append(stateContextTvOff.nextChannal() + "\n");
        //调高音量
        stringBuffer.append(stateContextTvOff.turnUp() + "\n");
        //调低音量
        stringBuffer.append(stateContextTvOff.turnDown() + "\n");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testStateMode());
    }
}
