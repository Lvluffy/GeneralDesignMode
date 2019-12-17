package com.luffy.generaldesignmodelib.behavior.templateMethodMode.abstractClass;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 模块方法模式~抽象类~计算机
 */
public abstract class AbsComputer {

    /**
     * 开启电源
     *
     * @return
     */
    protected String powerOpen() {
        return "开启电源";
    }

    /**
     * 检查硬件
     *
     * @return
     */
    protected String checkHardware() {
        return "检查硬件";
    }

    /**
     * 加载操作系统
     *
     * @return
     */
    protected String loadOS() {
        return "加载操作系统";
    }

    /**
     * 登录
     *
     * @return
     */
    protected String login() {
        return "普通用户，进入计算机无验证，直接进入系统";
    }

    /**
     * 固定的执行方法
     *
     * @return
     */
    public final String execute() {
        String s = "-----开机Start-----\n" +
                powerOpen() + "\n" +
                checkHardware() + "\n" +
                loadOS() + "\n" +
                login() + "\n" +
                "-----关机End-----\n";
        return s;
    }
}
