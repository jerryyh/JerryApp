package com.jerry.mobile.designpattern.struct.adapter;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/25
 * Description:
 */
public class B extends InterfaceAdapter{
    @Override
    public void a2() {
        Log.i("B","调用了b的方法");
    }
}
