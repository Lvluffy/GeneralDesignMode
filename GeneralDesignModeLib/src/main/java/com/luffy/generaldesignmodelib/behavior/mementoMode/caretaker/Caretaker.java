package com.luffy.generaldesignmodelib.behavior.mementoMode.caretaker;


import com.luffy.generaldesignmodelib.behavior.mementoMode.memento.Memento;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 备忘录模式~管理者
 * <p/>
 * 对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 */
public class Caretaker {

    /*备忘录*/
    Memento memento;

    /**
     * 获取存档
     *
     * @return
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * 存档
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
