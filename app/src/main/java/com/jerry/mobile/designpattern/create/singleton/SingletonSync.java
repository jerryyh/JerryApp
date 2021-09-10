package com.jerry.mobile.designpattern.create.singleton;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:双重锁的形式
 */
class SingletonSync {
    private static volatile Singleton singleton=null;

    private SingletonSync() {
    }
    public static Singleton getInstance(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
/**
 * 双重锁形式将同步内容下放到if内部，提高了执行的效率，这样就不必每次获取对象时都进行同步。
 *
 *
 * 双重锁形式中双重判断加同步的方式，比第一个种懒汉式的效率大大提升，因为如果单层if判断，在服务器允许的情况下，假设有一百个线程，耗费的时间为100（同步判断时间+if判断时间），而如果双重if判断，100的线程可以同时if判断，理论消耗的时间只有一个if判断的时间。
 *
 */
