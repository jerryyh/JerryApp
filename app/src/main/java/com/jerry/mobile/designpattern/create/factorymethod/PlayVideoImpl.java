package com.jerry.mobile.designpattern.create.factorymethod;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:具体功能的实现类
 */
public class PlayVideoImpl implements IFunctionModule{
    private String  TAG=getClass().getSimpleName();
    @Override
    public void function() {
        Log.i(TAG,"播放视频");
    }
}
