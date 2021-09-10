package com.jerry.mobile.designpattern.struct.bridge;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:
 */
public class ConcreateImplementorA implements Implementor {

    @Override
    public void operation() {
        Log.i("ConcreateImplementorA","this is ConcreateImplementorA's operation");
    }
}
