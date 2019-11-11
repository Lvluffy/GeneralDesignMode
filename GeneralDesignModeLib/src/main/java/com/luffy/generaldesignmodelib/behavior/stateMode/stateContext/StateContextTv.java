package com.luffy.generaldesignmodelib.behavior.stateMode.stateContext;


import com.luffy.generaldesignmodelib.behavior.stateMode.abstractState.AbstractStateTv;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 状态模式~状态环境~电视
 */
public class StateContextTv {
    AbstractStateTv abstractStateTv;

    public void setAbstractStateTv(AbstractStateTv abstractStateTv) {
        this.abstractStateTv = abstractStateTv;
    }

    /**
     * 下一频道
     *
     * @return
     */
    public String nextChannal() {
        return abstractStateTv.nextChannal();
    }

    /**
     * 上一频道
     *
     * @return
     */
    public String prevChannal() {
        return abstractStateTv.prevChannal();
    }

    /**
     * 调高音量
     *
     * @return
     */
    public String turnUp() {
        return abstractStateTv.turnUp();
    }

    /**
     * 调低音量
     *
     * @return
     */
    public String turnDown() {
        return abstractStateTv.turnDown();
    }

}
