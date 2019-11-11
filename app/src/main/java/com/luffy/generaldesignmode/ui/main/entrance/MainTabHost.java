package com.luffy.generaldesignmode.ui.main.entrance;

import com.luffy.generaldesignmode.R;
import com.luffy.generaldesignmode.ui.main.type.TabAllFragment;
import com.luffy.generaldesignmode.ui.main.type.TabBehaviorFragment;
import com.luffy.generaldesignmode.ui.main.type.TabCreateFragment;
import com.luffy.generaldesignmode.ui.main.type.TabStructureFragment;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 主页~底部导航栏
 */
public enum MainTabHost {

    Create(0, R.string.design_mode_type_create, R.drawable.tab_icon_create, TabCreateFragment.class),
    Structure(1, R.string.design_mode_type_structure, R.drawable.tab_icon_structure, TabStructureFragment.class),
    Behavior(2, R.string.design_mode_type_behavior, R.drawable.tab_icon_behavior, TabBehaviorFragment.class),
    All(3, R.string.design_mode_type_all, R.drawable.tab_icon_create, TabAllFragment.class);

    private int id;
    private int name;
    private int icon;
    private Class<?> cls;

    MainTabHost(int id, int name, int icon, Class<?> cls) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.cls = cls;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Class<?> getCls() {
        return cls;
    }

    public void setCls(Class<?> cls) {
        this.cls = cls;
    }
}
