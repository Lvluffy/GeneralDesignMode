package com.luffy.generaldesignmodelib.behavior.commandMode;

import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandBottom;
import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandLeft;
import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandRight;
import com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand.ConcreteCommandTop;
import com.luffy.generaldesignmodelib.behavior.commandMode.invoker.Invoker;
import com.luffy.generaldesignmodelib.behavior.commandMode.receiver.Receiver;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 命令模式~测试
 * @desc
 */
public class CommandModeTest {

    public static String testCommandMode() {
        /*接收者角色对象*/
        Receiver mReceiver = new Receiver();
        /*构建四种命令对象*/
        ConcreteCommandLeft commandLeft = new ConcreteCommandLeft(mReceiver);
        ConcreteCommandRight commandRight = new ConcreteCommandRight(mReceiver);
        ConcreteCommandBottom commandFastToBottom = new ConcreteCommandBottom(mReceiver);
        ConcreteCommandTop commandTransfrom = new ConcreteCommandTop(mReceiver);
        /*请求者执行不同的命令*/
        Invoker invoker = new Invoker();
        invoker.setCommandLeft(commandLeft);
        invoker.setCommandRight(commandRight);
        invoker.setCommandBottom(commandFastToBottom);
        invoker.setCommandTop(commandTransfrom);
        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(invoker.toLeft() + "\n");
        stringBuffer.append(invoker.toRight() + "\n");
        stringBuffer.append(invoker.toBottom() + "\n");
        stringBuffer.append(invoker.toTop() + "\n");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testCommandMode());
    }
}
