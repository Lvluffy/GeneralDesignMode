package com.luffy.generaldesignmodelib.create.prototypeMode;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 原型模式~登录会话
 */
public class LoginSession {
    static LoginSession mLoginSession = null;

    private UserPrototype userPrototype;

    private LoginSession() {
    }

    public static LoginSession getInstance() {
        if (mLoginSession == null) {
            mLoginSession = new LoginSession();
        }
        return mLoginSession;
    }

    /*设置已登录的信息，不对外开放*/
    void setUserPrototype(UserPrototype userPrototype) {
        this.userPrototype = userPrototype;
    }

    public UserPrototype getUserPrototype() {
        return userPrototype;
    }
}
