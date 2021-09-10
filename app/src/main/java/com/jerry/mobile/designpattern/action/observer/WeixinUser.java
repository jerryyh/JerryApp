package com.jerry.mobile.designpattern.action.observer;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:具体观察者(微信用户)
 */
public class WeixinUser implements Observer{
    private String name;

    public WeixinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        Log.i("WeixinUser",name+"-"+message) ;
    }
}
