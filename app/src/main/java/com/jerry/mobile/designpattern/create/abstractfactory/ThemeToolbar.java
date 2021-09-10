package com.jerry.mobile.designpattern.create.abstractfactory;

import android.content.Context;
import android.widget.Toolbar;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
abstract class ThemeToolbar extends Toolbar {
    public ThemeToolbar(Context context) {
        super(context);
    }

    /**
     * 初始化图标
     */
    public abstract void initIcon();

    /**
     * 初始话按钮颜色
     */
    public abstract void initTextColor();


    /**
     * 初始化按钮颜色
     */
    public abstract void initBackgroundColor();

}
