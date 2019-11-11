package com.luffy.generaldesignmodelib.behavior.templateMethodMode.concreteClass;


import com.luffy.generaldesignmodelib.behavior.templateMethodMode.abstractClass.AbsComputer;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 模块方法模式~具体子类~计算机～程序猿
 */
public class CoderComputer extends AbsComputer {
    /**
     * 登录
     *
     * @return
     */
    @Override
    protected String login() {
        return "程序猿，需要进行用户和密码验证";
    }
}
