package com.luffy.generaldesignmodelib.structure.facadeMode.subSystem;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 外观模式~具体子系统角色～拨号
 */
public class SubSystemPhoneConcrete implements SubSystemPhone {
    @Override
    public String dail() {
        return "打电话";
    }

    @Override
    public String hangup() {
        return "挂断";
    }
}
