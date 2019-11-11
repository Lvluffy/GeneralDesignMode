package com.luffy.generaldesignmodelib.structure.facadeMode.subSystem;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 外观模式~具体子系统角色～拍照
 */
public class SubSystemCameraConcrete implements SubSystemCamera {
    @Override
    public String open() {
        return "打开相机";
    }

    @Override
    public String takePicture() {
        return "拍照";
    }

    @Override
    public String close() {
        return "关闭相机";
    }
}
