package com.jerry.mobile.designpattern.create.singleton;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:懒汉式，也是常用的形式
 */
class SingletonClass {

    private static SingletonClass instance=null;

    public static synchronized SingletonClass getInstance(){
        if (instance==null){
            instance=new SingletonClass();
        }
        return instance;
    }

    public SingletonClass() {

    }
}
/**
 * 优势：通过使用 private 的构造函数确保在一个 application 中只产生一个实例，从而减少内存开支，
 * 特别是一个对象需要被频繁的创建和销毁时。
 */
