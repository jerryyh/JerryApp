package com.jerry.mobile.designpattern.struct.proxy;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jerry
 * @date 2021/5/25
 * Description:动态代理
 */
public class DynamiProxyHandler implements InvocationHandler {

    Object target;

    public DynamiProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Log.i("DynamiProxyHandler","委托朋友代购");
        method.invoke(target,objects);
        Log.i("DynamiProxyHandler","朋友把代购的物品交给我们");
        return null;
    }
}
