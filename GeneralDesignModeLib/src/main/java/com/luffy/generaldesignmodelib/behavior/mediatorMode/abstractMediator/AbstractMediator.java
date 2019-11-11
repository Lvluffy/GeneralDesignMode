package com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractMediator;

import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractColleague.AbstractColleague;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 中介者模式~抽象中介者
 */
public abstract class AbstractMediator {

    /**
     * 同事对象改变时通知中介者对象的方法
     *
     * @param abstractColleague
     * @return
     */
    public abstract String changed(AbstractColleague abstractColleague);
}
