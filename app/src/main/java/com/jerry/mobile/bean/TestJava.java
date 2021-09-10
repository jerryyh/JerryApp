package com.jerry.mobile.bean;

/**
 * @author jerry
 * @date 2021/5/31
 * Description:
 */
public class TestJava {
    public static UserJava method() {
        UserJava userJava = new UserJava();
        userJava.setAge(18);
        userJava.setName("张吉瑞");
        return userJava;
    }

    public static City getCity() {
        City city = new City("1", "武汉");
        return city;
    }

    public static String splictStrings() {
        int x = 4;
        int y = 7;
        return "sum of " + x + " and " + y + " is " + (x + y);
    }

    public static String getDescribe(int type) {
        String value = "";
        switch (type) {
            case 1:
                value = "one";
                break;
            case 2:
                value = "two";
                break;
            default:
                value = "other";
        }
        return value;
    }
}
