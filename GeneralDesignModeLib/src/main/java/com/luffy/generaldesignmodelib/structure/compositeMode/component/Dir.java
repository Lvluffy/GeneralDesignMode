package com.luffy.generaldesignmodelib.structure.compositeMode.component;

import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 组合模式~抽象构件~目录(包含文件夹和文件的抽象类)
 */
public interface Dir {
    /**
     * 添加一个文件夹或者文件
     *
     * @param dir
     */
    void addDir(Dir dir);

    /**
     * 移除一个文件夹或者文件
     *
     * @param dir
     */
    void removeDir(Dir dir);

    /**
     * 获取目录下所有文件夹和文件
     *
     * @return
     */
    List<Dir> getDirs();

    /**
     * 输出文件夹目录结构
     *
     * @return
     */
    String operation();

}
