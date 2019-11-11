package com.luffy.generaldesignmodelib.structure.compositeMode.composite;


import com.luffy.generaldesignmodelib.structure.compositeMode.component.Dir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 组合模式~树枝构件~文件夹
 */
public class Folder implements Dir {

    private String name;

    private List<Dir> dirs = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void removeDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public List<Dir> getDirs() {
        return dirs;
    }

    @Override
    public String operation() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name + "（");
        Iterator<Dir> iterator = getDirs().iterator();
        while (iterator.hasNext()) {
            Dir dir = iterator.next();
            /*递归操作*/
            String str = dir.operation();
            /*这里必须要手动加一次数据，否则界面中出不来*/
            stringBuffer.append(str);
            if (iterator.hasNext()) {
                stringBuffer.append("，");
            }
        }
        stringBuffer.append("）");
        return stringBuffer.toString();
    }

    /**
     * 清空文件夹下的所有元素
     */
    public void clear() {
        dirs.clear();
    }

}
