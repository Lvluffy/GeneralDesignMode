package com.luffy.generaldesignmodelib.structure.facadeMode.subSystem;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 外观模式~抽象子系统角色～拨号
 */
public interface SubSystemPhone {

    /**
     * 打电话
     *
     * @return
     */
    String dail();

    /**
     * 挂断
     *
     * @return
     */
    String hangup();
}
