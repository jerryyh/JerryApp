package com.jerry.mobile.designpattern.struct.decorator;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:组件
 */
public class Boy extends Person {
    @Override
    public void dressed() {
        Log.i("Boy","穿了内衣内裤");
    }
}
