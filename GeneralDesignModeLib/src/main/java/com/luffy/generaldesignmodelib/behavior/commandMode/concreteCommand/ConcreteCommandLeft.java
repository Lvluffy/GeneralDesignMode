package com.luffy.generaldesignmodelib.behavior.commandMode.concreteCommand;

import com.luffy.generaldesignmodelib.behavior.commandMode.abstractCommand.AbstractCommand;
import com.luffy.generaldesignmodelib.behavior.commandMode.receiver.Receiver;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 命令模式～具体命令~向左
 */
public class ConcreteCommandLeft implements AbstractCommand {

    private Receiver mReceiver;

    public ConcreteCommandLeft(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public String executeCommand() {
        return mReceiver.toLeft();
    }
}
