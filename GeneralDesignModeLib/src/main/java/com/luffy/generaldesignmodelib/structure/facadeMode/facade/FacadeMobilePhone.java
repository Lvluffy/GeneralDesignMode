package com.luffy.generaldesignmodelib.structure.facadeMode.facade;


import com.luffy.generaldesignmodelib.structure.facadeMode.subSystem.SubSystemCamera;
import com.luffy.generaldesignmodelib.structure.facadeMode.subSystem.SubSystemCameraConcrete;
import com.luffy.generaldesignmodelib.structure.facadeMode.subSystem.SubSystemPhone;
import com.luffy.generaldesignmodelib.structure.facadeMode.subSystem.SubSystemPhoneConcrete;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 外观模式～外观角色(系统对外的统一接口)~手机(包含两个子系统：1，拨号系统2，拍照系统)
 */
public class FacadeMobilePhone {

    /*拨号系统对象*/
    SubSystemPhone subSystemPhone = new SubSystemPhoneConcrete();
    /*拍照系统对象*/
    SubSystemCamera subSystemCamera = new SubSystemCameraConcrete();

    /**
     * 打电话
     *
     * @return
     */
    public String makePhone() {
        StringBuffer stringBuffer = new StringBuffer();
        /*打电话*/
        stringBuffer.append(subSystemPhone.dail() + "\n");
        /*挂断*/
        stringBuffer.append(subSystemPhone.hangup() + "\n");
        return stringBuffer.toString();
    }

    /**
     * 拍照片
     *
     * @return
     */
    public String takePicture() {
        StringBuffer stringBuffer = new StringBuffer();
        /*打开相机*/
        stringBuffer.append(subSystemCamera.open() + "\n");
        /*拍照*/
        stringBuffer.append(subSystemCamera.takePicture() + "\n");
        /*关闭相机*/
        stringBuffer.append(subSystemCamera.close() + "\n");
        return stringBuffer.toString();
    }
}
