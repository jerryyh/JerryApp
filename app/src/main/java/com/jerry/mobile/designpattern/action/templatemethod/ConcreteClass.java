package com.jerry.mobile.designpattern.action.templatemethod;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public class ConcreteClass extends AbstractClass{
    @Override
    public void op2() {
        System.out.println("sub op2");
    }

    @Override
    public void op3() {
        System.out.println("sub op3");
    }
}
