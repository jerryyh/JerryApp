package com.jerry.mobile.designpattern.struct.proxy;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:代理类(静态代理)
 */
public class ProxyShop implements IShop{
    private IShop mIshop;

    public ProxyShop(IShop target) {
        mIshop=target;
    }

    /**
     * 实现具体代购行为
     * @param str
     */
    @Override
    public void shop(String str) {
        Log.i("ProxyShop","开始代购");
        mIshop.shop(str);
        Log.i("ProxyShop","通过代购买到了该商品");
    }
}
