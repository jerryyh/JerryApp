package com.jerry.mobile.designpattern.struct.decorator;

import android.util.Log;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:继承PersonCloth实际装饰类（装饰者）
 */
public class CheapCloth extends PersonCloth{

    public CheapCloth(Person person) {
        super(person);
    }
    public void dressShorts(){
        Log.i("CleapCloth","穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
/**
 * Android源码中的装饰模式
 *
 * 在Android中Context常常被称为上帝对象，Context中定义了大量的抽象方法，如下
 *
 * //....代码省略...
 * public abstract void startActivity(@RequiresPermission Intent intent);
 * public abstract void startActivity(@RequiresPermission Intent intent,
 *             @Nullable Bundle options);
 * //....代码省略...
 * 而Context的真正实现其实是在ContextImpl中完成，ContextImpl继承自Context抽象类，并实现了Context的抽象方法.
 *
 * class ContextImpl extends Context {
 * //....代码省略...
 *  @Override
 *     public void startActivity(Intent intent) {
 *         warnIfCallingFromSystemProcess();
 *         startActivity(intent, null);
 *     }
 * @Override
 *     public void startActivity(Intent intent, Bundle options) {
 *         warnIfCallingFromSystemProcess();
 *
 *         // Calling start activity from outside an activity without FLAG_ACTIVITY_NEW_TASK is
 *         // generally not allowed, except if the caller specifies the task id the activity should
 *         // be launched in.
 *         if ((intent.getFlags()&Intent.FLAG_ACTIVITY_NEW_TASK) == 0
 *                 && options != null && ActivityOptions.fromBundle(options).getLaunchTaskId() == -1) {
 *             throw new AndroidRuntimeException(
 *                     "Calling startActivity() from outside of an Activity "
 *                     + " context requires the FLAG_ACTIVITY_NEW_TASK flag."
 *                     + " Is this really what you want?");
 *         }
 *         mMainThread.getInstrumentation().execStartActivity(
 *                 getOuterContext(), mMainThread.getApplicationThread(), null,
 *                 (Activity) null, intent, -1, options);
 *     }
 * //....代码省略...
 * }
 * ContextImpl其实承担的是组件的身份，那么谁来承担装饰者的身份呢，其实只要继承自ContextThemeWrapper的组件都是装饰者的身份，例如Activity.
 *
 * public class Activity extends ContextThemeWrapper
 * ContextThemeWrapper又继承ContextWrapper
 *
 * public class ContextWrapper extends Context {
 *     Context mBase;
 *
 *     public ContextWrapper(Context base) {
 *         mBase = base;
 *     }
 * }
 * 其实看到这里已经可以看到一些装饰者模式了，ContextWrapper的startActivity其实就是调用的mBase，而mBase实际上就是ContextImpl的实例.
 *
 * @Override
 *     public void startActivity(Intent intent) {
 *         mBase.startActivity(intent);
 *     }
 * 总结
 *
 * 装饰模式常常会和代理模式混淆，我们来说说这两者的区别，装饰模式是对对象功能的扩展，是继承关系的一种替代方案（比继承更加灵活），而代理模式则是给一个对象提供一个代理对象，并有代理对象来控制原有对象的引用。
 * 装饰模式应该为所有装饰的对象增强功能；代理模式对代理的对象施加控制，但不对对象本身的功能进行增强
 */
