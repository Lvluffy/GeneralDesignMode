package com.luffy.generaldesignmodelib.behavior.mementoMode.memento;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 备忘录模式~备忘录
 * <p/>
 * 负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 */
public class Memento {

    /*关卡；检查点*/
    public int checkpoint;
    /*生命值*/
    public int lifeValue;
    /*武器*/
    public String weapon;

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(int checkpoint) {
        this.checkpoint = checkpoint;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Memento[checkpoint=" + checkpoint + ",lifeValue=" + lifeValue + ",weapon=" + weapon + "]\n";
    }
}
