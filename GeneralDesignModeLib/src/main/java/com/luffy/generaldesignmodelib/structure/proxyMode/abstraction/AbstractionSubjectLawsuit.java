package com.luffy.generaldesignmodelib.structure.proxyMode.abstraction;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 代理模式~抽象主题～诉讼
 * <p/>
 * 案例:小明在上家公司上班，遇到老板拖欠工资甚至克扣工资的情况，这时小民果断了选择通过法律手段去维护自己的利益，
 * 于是请了律师，走诉讼流程，这时律师就是代理人。
 */
public interface AbstractionSubjectLawsuit {

    /**
     * 提交申请
     *
     * @return
     */
    String submit();

    /**
     * 进行举证
     *
     * @return
     */
    String burden();

    /**
     * 开始辩解
     *
     * @return
     */
    String defend();

    /**
     * 诉讼完成
     *
     * @return
     */
    String finish();
}
