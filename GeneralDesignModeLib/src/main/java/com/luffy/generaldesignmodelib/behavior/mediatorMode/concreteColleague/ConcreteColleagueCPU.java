package com.luffy.generaldesignmodelib.behavior.mediatorMode.concreteColleague;


import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractColleague.AbstractColleague;
import com.luffy.generaldesignmodelib.behavior.mediatorMode.abstractMediator.AbstractMediator;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 中介者模式~具体同事~CPU
 */
public class ConcreteColleagueCPU extends AbstractColleague {

    /**
     * 视频数据
     */
    private String dataVideo;
    /**
     * 音频数据
     */
    private String dataSound;

    /**
     * 构造函数
     *
     * @param abstractMediator
     */
    public ConcreteColleagueCPU(AbstractMediator abstractMediator) {
        super(abstractMediator);
    }

    /**
     * 获取视频数据
     *
     * @return
     */
    public String getDataVideo() {
        return dataVideo;
    }

    /**
     * 获取音频数据
     *
     * @return
     */
    public String getDataSound() {
        return dataSound;
    }

    /**
     * 解码数据
     *
     * @param data
     * @return
     */
    public String decodeData(String data) {
        /*分割音、视频数据*/
        String[] tmp = data.split("，");

        /*解析音、视频数据*/
        dataVideo = tmp[0];
        dataSound = tmp[1];

        /*告诉中介者自身状态改变*/
        return abstractMediator.changed(this);
    }
}
