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
        StringBuffer stringBuffer = new StringBuffer();
        //玩游戏
        stringBuffer.append(originator.play());
        //退出游戏
        stringBuffer.append(originator.quit());
        //恢复游戏
        stringBuffer.append(new Originator().restore(caretaker.getMemento()));
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(testMementoMode());
    }

}
