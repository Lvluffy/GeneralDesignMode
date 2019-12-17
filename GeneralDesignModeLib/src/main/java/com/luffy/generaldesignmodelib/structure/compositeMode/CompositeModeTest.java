package com.luffy.generaldesignmodelib.structure.compositeMode;


import com.luffy.generaldesignmodelib.structure.compositeMode.component.Dir;
import com.luffy.generaldesignmodelib.structure.compositeMode.composite.Folder;
import com.luffy.generaldesignmodelib.structure.compositeMode.leaf.File;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 组合模式~测试
 * @desc
 */
public class CompositeModeTest {

    public static String testCompositeMode() {
        /*创造一个目录对象(代表A盘)*/
        Dir dir = new Folder("A盘");

        /*在A盘目录下添加一个文件：Log.txt*/
        dir.addDir(new File("Log.txt"));

        /*在A盘目录下添加3个子文件夹:视频(video)、音乐(music)、图片(picture)*/
        Dir dirVideo = new Folder("视频");
        Dir dirMusic = new Folder("音乐");
        Dir dirPicture = new Folder("图片");

        /*视频目录下有文件：功夫熊猫.3gp*/
        dirVideo.addDir(new File("功夫熊猫.3gp"));
        dir.addDir(dirVideo);
        /*音乐目录下有文件：爱上一个不该爱的人.mp3*/
        dirMusic.addDir(new File("爱上一个不该爱的人.mp3"));
        dir.addDir(dirMusic);
        /*图片目录下有文件：沙漠风景.jpg*/
        dirPicture.addDir(new File("沙漠风景.jpg"));
        dir.addDir(dirPicture);
        return dir.operation();
    }

    public static void main(String[] args) {
        System.out.print(testCompositeMode());
    }
}
