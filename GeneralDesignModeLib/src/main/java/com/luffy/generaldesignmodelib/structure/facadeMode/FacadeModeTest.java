package com.luffy.generaldesignmodelib.structure.facadeMode;

import com.luffy.generaldesignmodelib.structure.facadeMode.facade.FacadeMobilePhone;

/**
 * Created by lvlufei on 2019/9/19
 *
 * @name 外观模式~测试
 * @desc
 */
public class FacadeModeTest {

    public static String testFacadeMode() {
        /*创建外观模式~系统对外的统一接口对象*/
        FacadeMobilePhone facadeMobilePhone = new FacadeMobilePhone();
        /*组装数据*/
        String s = "-----开启拍照功能-----\n" +
                facadeMobilePhone.takePicture() +
                "-----开启打电话功能-----\n" +
                facadeMobilePhone.makePhone();
        return s;
    }

    public static void main(String[] args) {
        System.out.print(testFacadeMode());
    }
}
