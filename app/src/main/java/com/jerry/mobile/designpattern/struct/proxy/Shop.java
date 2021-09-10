package com.jerry.mobile.designpattern.struct.proxy;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:目标类，具体实现购买行为
 */
public class Shop implements IShop {
    /**
     * 购物行为的具体表现
     * @param str
     */
    @Override
    public void shop(String str) {
        Log.i("Shop","我想购买的商品是"+str);
        Log.i("Shop","但是国内没货了" );
    }
}
