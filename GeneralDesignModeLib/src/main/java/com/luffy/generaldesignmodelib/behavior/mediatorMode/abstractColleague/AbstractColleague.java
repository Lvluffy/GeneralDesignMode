package com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractColleague;

import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractMediator.AbstractMediator;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 中介者模式~抽象同事
 */
public abstract class AbstractColleague {

    /**
     * 中介者对象
     */
    protected AbstractMediator abstractMediator;

    /**
     * 构造函数
     *
     * @param abstractMediator
     */
    public AbstractColleague(AbstractMediator abstractMediator) {
        this.abstractMediator = abstractMediator;
    }
}
