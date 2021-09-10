package com.jerry.mobile.designpattern.struct.proxy;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/25
 * Description:
 */
public class Friend implements IShop {
    @Override
    public void shop(String str) {
        Log.i("Friend","朋友代替我们购物");
    }
}
