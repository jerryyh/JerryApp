package com.jerry.mobile.designpattern.struct.adapter;

import android.util.Log;


/**
 * @author jerry
 * @date 2021/5/25
 * Description:类适配器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void method2() {
        Log.i("Adapter","method2");
    }

}
