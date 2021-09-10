package com.jerry.mobile.bean;

/**
 * @author jerry
 * @date 2021/5/31
 * Description:
 */
public class UserJava {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserJava{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
