package com.luffy.generaldesignmodelib.structure.proxyMode;

import com.luffy.generaldesignmodelib.structure.proxyMode.proxy.ProxySubjectLawsuitLawxy;
import com.luffy.generaldesignmodelib.structure.proxyMode.real.RealSubjectLawsuitXiaoMin;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 代理模式~测试
 * @desc
 */
public class ProxyModeTest {

    public static String testProxyMode() {
        /*构造一个小民类*/
        RealSubjectLawsuitXiaoMin xiaoMin = new RealSubjectLawsuitXiaoMin();
        /*构造一个代理律师类*/
        ProxySubjectLawsuitLawxy lawxy = new ProxySubjectLawsuitLawxy(xiaoMin);
        /*组装数据*/
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(lawxy.submit() + "\n");
        stringBuffer.append(lawxy.burden() + "\n");
        stringBuffer.append(lawxy.defend() + "\n");
        stringBuffer.append(lawxy.finish() + "\n");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.print(testProxyMode());
    }
}
