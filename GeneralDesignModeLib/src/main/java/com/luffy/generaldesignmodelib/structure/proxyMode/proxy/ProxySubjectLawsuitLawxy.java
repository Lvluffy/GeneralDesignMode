package com.luffy.generaldesignmodelib.structure.proxyMode.proxy;

import com.luffy.generaldesignmodelib.structure.proxyMode.abstraction.AbstractionSubjectLawsuit;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 代理模式~代理～诉讼~律师
 */
public class ProxySubjectLawsuitLawxy implements AbstractionSubjectLawsuit {

    /*持有一个具体被代理的引用*/
    private AbstractionSubjectLawsuit abstractionSubjectLawsuit;

    public ProxySubjectLawsuitLawxy(AbstractionSubjectLawsuit abstractionSubjectLawsuit) {
        this.abstractionSubjectLawsuit = abstractionSubjectLawsuit;
    }

    /**
     * 提交申请
     *
     * @return
     */
    @Override
    public String submit() {
        return abstractionSubjectLawsuit.submit();
    }

    /**
     * 进行举证
     *
     * @return
     */
    @Override
    public String burden() {
        return abstractionSubjectLawsuit.burden();
    }

    /**
     * 开始辩解
     *
     * @return
     */
    @Override
    public String defend() {
        return abstractionSubjectLawsuit.defend();
    }

    /**
     * 诉讼完成
     *
     * @return
     */
    @Override
    public String finish() {
        return abstractionSubjectLawsuit.finish();
    }
}
