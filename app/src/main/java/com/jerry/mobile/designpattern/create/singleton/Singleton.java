package com.jerry.mobile.designpattern.create.singleton;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:饿汉式
 */
public class Singleton {
    private static final Singleton instance=new Singleton();

    public Singleton() {
    }
}
/**
 * 因为单例是静态的final变量，所以当类第一次加载到内存中的时候就初始化了，那么创建的实例固然是线程安全的。
 */
