package com.jerry.mobile.designpattern.action.command;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:具体命令角色
 */
public class ConcreteCommend implements Commend{
    private Receiver receiver;

    public ConcreteCommend(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
     //调用并执行命令
        receiver.action();
    }
}
