package com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague;

import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractColleague.AbstractColleague;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractMediator.AbstractMediator;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 中介者模式~具体同事~显卡
 */
public class ConcreteColleagueGraphicsCard extends AbstractColleague {
    /**
     * 构造函数
     *
     * @param abstractMediator
     */
    public ConcreteColleagueGraphicsCard(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    /**
     * 播放视频
     *
     * @param data
     * @return
     */
    public String videoPlay(String data) {
        return "视频：" + data;
    }
}
