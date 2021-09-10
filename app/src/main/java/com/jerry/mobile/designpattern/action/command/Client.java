package com.jerry.mobile.designpattern.action.command;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        //创建接受者
        Receiver receiver = new Receiver();
        //创造命令对象，设定它的接收者
        Commend commend = new ConcreteCommend(receiver);
        //创造请求者，把命令对象设置进去
        Invoker invoker = new Invoker(commend);
        //执行方法
        invoker.action();
    }
}
/**
 * 意图
 * 将一个请求封装为一个对象(即我们创建的Command对象），从而使你可用不同的请求对客户进行参数化; 对请求排队或记录请求日志，以及支持可撤销的操作
 * 解决的问题
 * 在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适。
 *
 * 模式中的角色
 * 抽象命令（Command）：定义命令的接口，声明执行的方法。
 * 具体命令（ConcreteCommand）：具体命令，实现要执行的方法，它通常是“虚”的实现；通常会有接收者，并调用接收者的功能来完成命令要执行的操作。
 * 接收者（Receiver）：真正执行命令的对象。任何类都可能成为一个接收者，只要能实现命令要求实现的相应功能。
 * 调用者（Invoker）：要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。
 * 客户端（Client）：命令由客户端来创建，并设置命令的接收者。
 * ————————————————
 *
 * Android中的应用
 * Runbable,Thread,其实用的就是最简单的命令模式。
 *
 * 版权声明：本文为CSDN博主「hunter800421」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/foolish0421/article/details/56011783
 */
