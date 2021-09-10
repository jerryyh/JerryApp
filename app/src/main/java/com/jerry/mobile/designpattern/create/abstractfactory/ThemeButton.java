package com.jerry.mobile.designpattern.create.abstractfactory;

import android.content.Context;
import android.widget.Button;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
abstract class ThemeButton extends androidx.appcompat.widget.AppCompatButton {
    public ThemeButton(@NonNull @NotNull Context context) {
        super(context);
        initTextColor();
        initBackgroundColor();
    }
    /**
     * 初始化按钮颜色
     */
    public abstract void initTextColor();

    /**
     * 初始化按钮背景颜色
     */
    public abstract void initBackgroundColor();
}
