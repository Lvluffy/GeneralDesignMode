package com.luffy.generaldesignmode.ui.base;

import android.app.Activity;

import com.luffy.generaldesignmode.mode.BaseBean;

/**
 * Created by lvlufei on 2017/11/1.
 */
public class DesignBaseBean<T extends Activity> extends BaseBean {
    public String hint;
    public Class<T> activityName;

    public String getHint() {
        return this.hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public Class<?> getActivityName() {
        return this.activityName;
    }

    public void setActivityName(Class<T> activityName) {
        this.activityName = activityName;
    }
}
