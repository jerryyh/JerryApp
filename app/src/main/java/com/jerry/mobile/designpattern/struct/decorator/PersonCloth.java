package com.jerry.mobile.designpattern.struct.decorator;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:PersonCloth用来装饰Person（组件）
 */
public abstract class PersonCloth extends Person {
    protected Person mPerson;//保持一个Person类的引用

    public PersonCloth(Person person) {
        mPerson=person;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }
}


/**
 * 源码的装饰模式
 *在Android中Context常常被称为上帝对象
 *
 *
 *
 *
 *
 *
 */
