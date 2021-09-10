package com.jerry.mobile.designpattern.create.abstractfactory;

import android.content.Context;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:暗色系主题工厂(其它比如亮色主题工厂省略)
 */
public class DarkThemeFactory extends AbstractThemeFactory{
    public DarkThemeFactory(Context mContext) {
        super(mContext);
    }

    @Override
    public ThemeButton createButton() {
        return new ButtonDark(mContext);
    }

    @Override
    public ThemeToolbar createToolbar() {
        return new ToolbarDark(mContext);
    }
}

/**
 * 大家可以看到，抽象工厂模式的结构相对于简单工厂和工厂方法模式来说要复杂的多，但是其本身也是应用于较为复杂场景的解耦，
 * 比如上述事例中，我们就应对了多个层面的变化，因此在实际项目开发中是否使用抽象工厂模式还需要看具体情况。
 *
 * 总结
 * 优点：
 * 一个显著的优点是分离接口与实现，客户端使用抽象工厂来创建需要的对象，而客户端根本就不知道具体实现是谁，客户端只是面向产品接口编程而已，使其从具体的产品实现中解耦，同时基于接口与实现的分离，使抽象工厂方法模式在切换产品类时更加灵活，容易。
 * 缺点：
 * 随着产品类的增加，抽象工厂也得修改，相当于所有的具体工厂都得修改，不易扩展新的产品
 *
 */
