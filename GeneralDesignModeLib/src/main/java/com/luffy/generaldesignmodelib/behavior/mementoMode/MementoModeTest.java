package com.luffy.generaldesignmodelib.behavior.mementoMode;

import com.luffy.generaldesignmodelib.behavior.mementoMode.caretaker.Caretaker;
import com.luffy.generaldesignmodelib.behavior.mementoMode.originator.Originator;

/**
 * Created by lvlufei on 2019/9/20
 *
 * @name 备忘录模式～测试
 * @desc
 */
public class MementoModeTest {

    public static String testMementoMode() {
        /*构建发起人（Originator）对象*/
        Originator originator = new Originator();
        /*构建管理者（（Caretaker）对象*/
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        /*组装数据*/
        String s = originator.play() +
                originator.quit() +
                new Originator().restore(caretaker.getMemento());
        //玩游戏
        //退出游戏
        //恢复游戏
        return s;
    }

    public static void main(String[] args) {
        System.out.println(testMementoMode());
    }

}
