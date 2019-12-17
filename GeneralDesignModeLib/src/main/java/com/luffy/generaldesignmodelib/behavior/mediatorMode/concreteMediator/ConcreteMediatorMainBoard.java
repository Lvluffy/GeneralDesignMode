package com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteMediator;


import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractColleague.AbstractColleague;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractMediator.AbstractMediator;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueCDDevice;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueCPU;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueGraphicsCard;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague.ConcreteColleagueSoundCard;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 中介者模式~具体中介者~主板
 */
public class ConcreteMediatorMainBoard extends AbstractMediator {

    /**
     * CPU同事
     */
    private ConcreteColleagueCPU concreteColleagueCPU;
    /**
     * 光驱同事
     */
    private ConcreteColleagueCDDevice concreteColleagueCDDevice;
    /**
     * 显卡同事
     */
    private ConcreteColleagueGraphicsCard concreteColleagueGraphicsCard;
    /**
     * 声卡同事
     */
    private ConcreteColleagueSoundCard concreteColleagueSoundCard;

    /**
     * 设置CPU同事
     *
     * @param concreteColleagueCPU
     */
    public void setConcreteColleagueCPU(ConcreteColleagueCPU concreteColleagueCPU) {
        this.concreteColleagueCPU = concreteColleagueCPU;
    }

    /**
     * 设置光驱同事
     *
     * @param concreteColleagueCDDevice
     */
    public void setConcreteColleagueCDDevice(ConcreteColleagueCDDevice concreteColleagueCDDevice) {
        this.concreteColleagueCDDevice = concreteColleagueCDDevice;
    }

    /**
     * 设置显卡同事
     *
     * @param concreteColleagueGraphicsCard
     */
    public void setConcreteColleagueGraphicsCard(ConcreteColleagueGraphicsCard concreteColleagueGraphicsCard) {
        this.concreteColleagueGraphicsCard = concreteColleagueGraphicsCard;
    }

    /**
     * 设置声卡同事
     *
     * @param concreteColleagueSoundCard
     */
    public void setConcreteColleagueSoundCard(ConcreteColleagueSoundCard concreteColleagueSoundCard) {
        this.concreteColleagueSoundCard = concreteColleagueSoundCard;
    }

    /**
     * 处理CPU读取数据后与其他设备同事的交互
     *
     * @param concreteColleagueCPU
     * @return
     */
    private String handleCPU(ConcreteColleagueCPU concreteColleagueCPU) {
        String s = concreteColleagueGraphicsCard.videoPlay(concreteColleagueCPU.getDataVideo()) + "\n" +
                concreteColleagueSoundCard.soundPlay(concreteColleagueCPU.getDataSound());
        return s;
    }

    /**
     * 处理光驱同事读取数据后与其他设备同事的交互
     *
     * @param concreteColleagueCDDevice
     * @return
     */
    private String handleCDDevice(ConcreteColleagueCDDevice concreteColleagueCDDevice) {
        return concreteColleagueCPU.decodeData(concreteColleagueCDDevice.readData());
    }

    /**
     * 同事对象改变时通知中介者对象的方法
     *
     * @param abstractColleague
     * @return
     */
    @Override
    public String changed(AbstractColleague abstractColleague) {
        if (abstractColleague == concreteColleagueCPU) {
            return handleCPU((ConcreteColleagueCPU) abstractColleague);
        } else if (abstractColleague == concreteColleagueCDDevice) {
            return handleCDDevice((ConcreteColleagueCDDevice) abstractColleague);
        }
        return null;
    }
}
