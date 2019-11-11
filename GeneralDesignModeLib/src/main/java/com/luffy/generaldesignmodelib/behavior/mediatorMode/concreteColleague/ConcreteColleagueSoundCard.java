package com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague;


import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractColleague.AbstractColleague;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractMediator.AbstractMediator;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 中介者模式~具体同事~声卡
 */
public class ConcreteColleagueSoundCard extends AbstractColleague {
    /**
     * 构造函数
     *
     * @param abstractMediator
     */
    public ConcreteColleagueSoundCard(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    /**
     * 播放音频
     *
     * @param data
     * @return
     */
    public String soundPlay(String data) {
        return "音频：" + data;
    }
}
