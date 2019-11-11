package com.luffy.generaldesignmodelib.structure.proxyMode.real;

import com.luffy.generaldesignmodelib.structure.proxyMode.abstraction.AbstractionSubjectLawsuit;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 代理模式~真实主题～诉讼～小明
 */
public class RealSubjectLawsuitXiaoMin implements AbstractionSubjectLawsuit {
    /**
     * 提交申请
     *
     * @return
     */
    @Override
    public String submit() {
        return "老板拖欠工资！特批申请仲裁。";
    }

    /**
     * 进行举证
     *
     * @return
     */
    @Override
    public String burden() {
        return "这是合同书和过去一年的银行工资流水。";
    }

    /**
     * 开始辩解
     *
     * @return
     */
    @Override
    public String defend() {
        return "证据确凿！不需要再讲什么了。";
    }

    /**
     * 诉讼完成
     *
     * @return
     */
    @Override
    public String finish() {
        return "诉讼成功！判决老板即日起7天内结算工资。";
    }
}
