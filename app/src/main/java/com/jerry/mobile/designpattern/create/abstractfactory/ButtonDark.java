package com.jerry.mobile.designpattern.create.abstractfactory;

import android.content.Context;
import android.graphics.Color;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
 class ButtonDark extends ThemeButton{
    public ButtonDark(@NonNull @NotNull Context context) {
        super(context);
    }

    @Override
    public void initTextColor() {
        setTextColor(Color.parseColor("#e94715"));
    }

    @Override
    public void initBackgroundColor() {
        setBackgroundColor(Color.parseColor("#e94715"));
    }
}
