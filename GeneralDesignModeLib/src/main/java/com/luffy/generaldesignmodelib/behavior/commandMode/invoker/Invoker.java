package com.luffy.generaldesignmodelib.behavior.commandMode.invoker;

import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandBottom;
import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandLeft;
import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandRight;
import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandTop;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 命令模式~调用者/请求者
 */
public class Invoker {
    /*向左的命令对象*/
    private ConcreteCommandLeft commandLeft;
    /*向右的命令对象*/
    private ConcreteCommandRight commandRight;
    /*向下的命令对象*/
    private ConcreteCommandBottom commandBottom;
    /*向上的命令对象*/
    private ConcreteCommandTop commandTop;

    public void setCommandLeft(ConcreteCommandLeft commandLeft) {
        this.commandLeft = commandLeft;
    }

    public void setCommandRight(ConcreteCommandRight commandRight) {
        this.commandRight = commandRight;
    }

    public void setCommandBottom(ConcreteCommandBottom commandBottom) {
        this.commandBottom = commandBottom;
    }

    public void setCommandTop(ConcreteCommandTop commandTop) {
        this.commandTop = commandTop;
    }

    /**
     * 向左
     *
     * @return
     */
    public String toLeft() {
        return commandLeft.executeCommand();
    }

    /**
     * 向右
     *
     * @return
     */
    public String toRight() {
        return commandRight.executeCommand();
    }

    /**
     * 向下
     *
     * @return
     */
    public String toBottom() {
        return commandBottom.executeCommand();
    }

    /**
     * 向上
     *
     * @return
     */
    public String toTop() {
        return commandTop.executeCommand();
    }
}
