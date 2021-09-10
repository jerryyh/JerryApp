package com.jerry.mobile.designpattern.create.singleton;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:静态内部类方式
 */
public class SingletonInnerClass {

    private SingletonInnerClass(){

    }
    private static SingletonInnerClass getInstance(){
        return SingletonInnerClassHolder.instance;
    }

    private static class SingletonInnerClassHolder{
        private static final SingletonInnerClass instance=new SingletonInnerClass();
    }
}
/**
 * 当外部类Singleton被加载时，其静态内部类SingeletonHolder不会被加载，所以它的成员变量sInstance是不会被初始化的，
 * 只有当调用Singleton.getInstance()方法时，才会加载SingeletonHolder并且初始化其成员变量，而类加载时是线程安全的，
 * 这样既保证了延迟加载，也保证了线程安全，同时也简化了代码量。
 *
 */
