package com.luffy.generaldesignmodelib.structure.compositeMode.leaf;


import com.luffy.generaldesignmodelib.structure.compositeMode.component.Dir;

import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 组合模式~树叶构件~文件
 */
public class File implements Dir {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持");
    }

    @Override
    public void removeDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持");
    }

    @Override
    public List<Dir> getDirs() {
        throw new UnsupportedOperationException("文件对象不支持");
    }

    @Override
    public String operation() {
        return name;
    }

}
