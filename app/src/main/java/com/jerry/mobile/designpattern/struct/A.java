package com.jerry.mobile.designpattern.struct;

import com.jerry.mobile.designpattern.struct.adapter.B;
import com.jerry.mobile.designpattern.struct.bridge.Abstraction;
import com.jerry.mobile.designpattern.struct.bridge.ConcreateImplementorA;
import com.jerry.mobile.designpattern.struct.bridge.RefinedAbstraction;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:
 */
public class A {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();
       //调用第一个实现类
        abstraction.setImplementor(new ConcreateImplementorA());
        abstraction.operation();
    }
}
