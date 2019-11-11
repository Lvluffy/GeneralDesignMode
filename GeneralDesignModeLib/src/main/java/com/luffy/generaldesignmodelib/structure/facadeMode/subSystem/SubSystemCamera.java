package com.luffy.generaldesignmodelib.structure.facadeMode.subSystem;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 外观模式~抽象子系统角色～拍照
 */
public interface SubSystemCamera {

    /**
     * 打开相机
     *
     * @return
     */
    String open();

    /**
     * 拍照
     *
     * @return
     */
    String takePicture();

    /**
     * 关闭相机
     *
     * @return
     */
    String close();
}
