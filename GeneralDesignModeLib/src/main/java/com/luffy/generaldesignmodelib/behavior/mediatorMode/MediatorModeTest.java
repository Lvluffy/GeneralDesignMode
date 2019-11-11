package com.luffy.generaldesignmodelib.behavior.mediatorMode;

import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueCDDevice;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueCPU;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueGraphicsCard;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueSoundCard;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteMediator.ConcreteMediatorMainBoard;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 中介者模式~测试
 * @desc
 */
public class MediatorModeTest {

    public static String testMediatorMode() {
        StringBuffer stringBuffer = new StringBuffer();
        /*构造主板中介者对象*/
        ConcreteMediatorMainBoard mediatorMainBoard = new ConcreteMediatorMainBoard();
        /*分别构造各个同事对象*/
        ConcreteColleagueCPU concreteColleagueCPU = new ConcreteColleagueCPU(mediatorMainBoard);
        ConcreteColleagueCDDevice concreteColleagueCDDevice = new ConcreteColleagueCDDevice(mediatorMainBoard);
        ConcreteColleagueGraphicsCard concreteColleagueGraphicsCard = new ConcreteColleagueGraphicsCard(mediatorMainBoard);
        ConcreteColleagueSoundCard concreteColleagueSoundCard = new ConcreteColleagueSoundCard(mediatorMainBoard);
        /*将各个同事告知中介者*/
        mediatorMainBoard.setConcreteColleagueCPU(concreteColleagueCPU);
        mediatorMainBoard.setConcreteColleagueCDDevice(concreteColleagueCDDevice);
        mediatorMainBoard.setConcreteColleagueGraphicsCard(concreteColleagueGraphicsCard);
        mediatorMainBoard.setConcreteColleagueSoundCard(concreteColleagueSoundCard);
        /*完成后开始处理：这里是开始播放*/
        stringBuffer.append(concreteColleagueCDDevice.loadData());
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testMediatorMode());
    }
}
