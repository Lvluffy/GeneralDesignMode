package com.luffy.generaldesignmodelib.create.prototypeMode;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 原型模式~登录接口实现（具体的登录）
 */
public class ConcreteLogin implements Login {
    @Override
    public void login() {
        /*获取用户信息*/
        UserPrototype userPrototype = new UserPrototype();
        userPrototype.setName("Mr.Simple");
        userPrototype.setSex("男");
        userPrototype.setAge("23");
        userPrototype.setPhoneNum("012-3265");
        /*保存用户信息*/
        LoginSession.getInstance().setUserPrototype(userPrototype);
    }
}
