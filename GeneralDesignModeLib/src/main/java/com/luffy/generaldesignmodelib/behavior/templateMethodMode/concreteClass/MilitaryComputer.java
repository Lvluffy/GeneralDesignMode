package com.luffy.generaldesignmodelib.behavior.templateMethodMode.concreteClass;


import com.luffy.generaldesignmodelib.behavior.templateMethodMode.abstractClass.AbsComputer;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 模块方法模式~具体子类~计算机～军用
 */
public class MilitaryComputer extends AbsComputer {
    /**
     * 检查硬件
     *
     * @return
     */
    @Override
    protected String checkHardware() {
        return "检查硬件防火墙";
    }

    /**
     * 登录
     *
     * @return
     */
    @Override
    protected String login() {
        return "进行指纹识别等复杂的用户验证";
    }
}
