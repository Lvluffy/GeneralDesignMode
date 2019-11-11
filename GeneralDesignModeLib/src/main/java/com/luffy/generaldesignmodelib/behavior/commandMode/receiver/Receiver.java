package com.luffy.generaldesignmodelib.behavior.commandMode.receiver;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 命令模式~实现者/接收者（逻辑代码）
 */
public class Receiver {

    /**
     * 向左
     *
     * @return
     */
    public String toLeft() {
        return "向左";
    }

    /**
     * 向右
     *
     * @return
     */
    public String toRight() {
        return "向右";
    }

    /**
     * 向下
     *
     * @return
     */
    public String toBottom() {
        return "向下";
    }

    /**
     * 向上
     *
     * @return
     */
    public String toTop() {
        return "向上";
    }

}
