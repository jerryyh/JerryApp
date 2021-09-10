package com.jerry.mobile.designpattern.struct.bridge;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:桥接模式，将抽象部分与它的实现部分分离，使它们都可以独立地变化
 *  其中，Abstraction为抽象化角色，定义出该角色的行为，同时保存一个对实现化角色的引用；
 *  Implementor是实现化角色，它是接口或者抽象类，定义角色必需的行为和属性；
 *  RefinedAbstraction为修正抽象化角色，引用实现化角色对抽象化角色进行修正
 *  ConcreteImplementor为具体实现化角色，实现接口或抽象类定义的方法或属性。
 *
 *  是不是感觉上面这段话很难懂，其实说简单点就是在Abstraction和Implementor之间架了一座桥（聚合线），这里体现了一个原则就是合成/聚合复用原则，具体看目录篇对基本原则的讲解及举例。下面放上模板代码。
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        super.operation();
    }
}


/**
 * 优点：
 * 1.实现了抽象和实现部分分离,有助于系统进行分层设计，从而产生更好的结构化系统
 * 2.更好的扩展性，抽象部分和实现部分可以分别独立扩展，而不会相互影响，大大提供了系统的可扩展性
 * 3.可动态的切换实现
 * 4.实现细节对客户端透明，可以对用户隐藏实现细节
 *
 * 缺点：
 * 1.桥接模式的引入增加了系统的理解和设计难度
 * 2.桥接模式要求正确识别出系统中的两个独立变化的维度，因此其范围有一定的局限性
 *
 * 系统中的桥接模式 windowManager和 PhoneWindow（R.drawable.window）
 */
