package com.jerry.mobile.designpattern.struct.bridge;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:
 */
public class ConcreateImplementorB implements Implementor {

    @Override
    public void operation() {
        Log.i("ConcreateImplementorB","this is ConcreateImplementorB's operation");
    }
}
