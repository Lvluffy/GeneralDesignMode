package com.luffy.generaldesignmodelib.create.prototypeMode;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 原型模式～测试
 * @desc
 */
public class PrototypeModeTest {

    public static String testPrototypeMode() {
        /*保存用户信息*/
        ConcreteLogin concreteLogin = new ConcreteLogin();
        concreteLogin.login();
        return LoginSession.getInstance().getUserPrototype().toString();
    }

    public static void main(String[] args) {
        System.out.print(testPrototypeMode());
    }
}
