package com.luffy.generaldesignmodelib.create.prototypeMode;

/**
 * Created by lvlufei on 2017/11/1.
 * <p>
 * 用户-原型类
 */
public class UserPrototype implements Cloneable {

    /*姓名*/
    public String name;
    /*性别*/
    public String sex;
    /*年龄*/
    public String age;
    /*手机号*/
    public String phoneNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 克隆方法
     */
    @Override
    public Object clone() {
        UserPrototype userPrototype = null;
        try {
            userPrototype = (UserPrototype) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userPrototype;
    }

    @Override
    public String toString() {
        return "User [ name=" + name + ",sex=" + sex + ",age=" + age + ",phoneNum=" + phoneNum + "]";
    }
}
