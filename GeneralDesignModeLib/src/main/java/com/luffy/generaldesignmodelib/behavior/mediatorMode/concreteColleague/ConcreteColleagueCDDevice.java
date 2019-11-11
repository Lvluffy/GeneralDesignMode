package com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague;

import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractColleague.AbstractColleague;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractMediator.AbstractMediator;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 中介者模式~具体同事~光驱
 */
public class ConcreteColleagueCDDevice extends AbstractColleague {

    /**
     * 视频数据
     */
    private String dataVideo;

    /**
     * 构造函数
     *
     * @param abstractMediator
     */
    public ConcreteColleagueCDDevice(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    /**
     * 读取数据
     *
     * @return
     */
    public String readData() {
        return dataVideo;
    }

    public String loadData() {
        /*实际情况中视频和音频都在一个数据流中*/
        dataVideo = "视频数据，音频数据";

        /*通知中介者数据改变了*/
        return abstractMediator.changed(this);
    }
}
