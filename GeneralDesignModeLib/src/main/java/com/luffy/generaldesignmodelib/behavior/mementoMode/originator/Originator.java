package com.luffy.generaldesignmodelib.behavior.mementoMode.originator;

import com.luffy.generaldesignmodelib.behavior.mementoMode.memento.Memento;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 备忘录模式~发起人
 * <p/>
 * 记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * <p/>
 * 使命召唤游戏
 */
public class Originator {

    /*关卡;检查点*/
    private int checkpoint = 1;
    /*生命值*/
    private int lifeValue = 100;
    /*武器*/
    private String weapon = "沙漠之鹰";

    /**
     * 创建备忘录
     *
     * @return
     */
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setCheckpoint(checkpoint);
        memento.setLifeValue(lifeValue);
        memento.setWeapon(weapon);
        return memento;
    }

    /**
     * 玩游戏
     *
     * @return
     */
    public String play() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append("玩游戏:\n").append(String.format("第%d关", checkpoint)).append("奋战杀敌中.").append("\n");
            lifeValue -= 10;
            stringBuilder.append("进度升级啦" + "\n");
            checkpoint++;
            stringBuilder.append("到达").append(String.format("第%d关", checkpoint)).append("\n");
            stringBuilder.append("---------------\n");
        }
        return stringBuilder.toString();
    }

    /**
     * 退出游戏
     *
     * @return
     */
    public String quit() {
        String s = "退出前的游戏属性:\n" + this.toString() +
                "退出游戏\n" +
                "---------------\n";
        return s;
    }

    /**
     * 恢复游戏
     *
     * @param memento
     */
    public String restore(Memento memento) {
        this.checkpoint = memento.checkpoint;
        this.lifeValue = memento.lifeValue;
        this.weapon = memento.weapon;
        return "恢复后的游戏属性:\n" + memento.toString() + "---------------\n";
    }

    @Override
    public String toString() {
        return "Originator[checkpoint=" + checkpoint + ",lifeValue=" + lifeValue + ",weapon=" + weapon + "]\n";
    }

}
