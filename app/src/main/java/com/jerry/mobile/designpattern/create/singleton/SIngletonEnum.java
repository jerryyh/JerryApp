package com.jerry.mobile.designpattern.create.singleton;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public enum  SIngletonEnum {
    INSTANCE;

    public void doSomething(){

    }
    /**
     * 枚举中的构造方法只能写成 private 或是不写「不写默认就是 private」，所以枚举防止外部来实例化对象
     */
    private SIngletonEnum(){
    }
}
/**
 * Singleton.INSTANCE.doSomething();
 * 这种方法在功能上与公有域方法相近，但是它更加简洁，无偿提供了序列化机制，绝对防止多次实例化，
 * 即使是在面对复杂序列化或者反射攻击的时候。虽然这种方法还没有广泛采用，但是单元素的枚举类型已经成为实现Singleton的最佳方法。
 * —-《Effective Java 中文版 第二版》
 *
 */
