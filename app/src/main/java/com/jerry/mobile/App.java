package com.jerry.mobile;

import android.app.Application;

import com.didichuxing.doraemonkit.DoraemonKit;
import com.hjq.permissions.XXPermissions;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
      // 当前项目是否已经适配了分区存储的特性
        XXPermissions.setScopedStorage(true);
        DoraemonKit.install(this, "pId");

    }
}
