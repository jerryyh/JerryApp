package com.jerry.mobile.designpattern.create.abstractfactory;

import android.content.Context;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:抽象主题工厂类
 */
public abstract class AbstractThemeFactory {
    protected Context mContext;

    public AbstractThemeFactory(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * 创建主题按钮
     */
    public abstract ThemeButton createButton();

    /**
     * 创建主题标题栏
     */
    public abstract ThemeToolbar createToolbar();
}

/**
 * 其实我们平时在开发中应该很少用到抽象工厂模式，一个很重要的原因是，其相对于其他两种工厂模式来说略显复杂，对于整体架构而言修改较大且不易施展。一个很典型的例子适用于数据库模型的构建，不过对于这块来讲，大多说设计模式都能应用到其中，
 * 对于 Android 开发者来说，抽象工厂的一个更好地应用是在主题修改上，假如在项目中需要引入一套主题切换的功能，那么使用抽象工厂来构建主题框架再适合不过了，下面就以一个代码示例在说明吧
 *
 */
