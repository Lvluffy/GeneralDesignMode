package com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand;

import com.luffy.generaldesignmodelib.behavior.commandMode.abstractCommand.AbstractCommand;
import com.luffy.generaldesignmodelib.behavior.commandMode.receiver.Receiver;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 命令模式～具体命令~向下
 */
public class ConcreteCommandBottom implements AbstractCommand {

    private Receiver mReceiver;

    public ConcreteCommandBottom(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public String executeCommand() {
        return mReceiver.toBottom();
    }
}
