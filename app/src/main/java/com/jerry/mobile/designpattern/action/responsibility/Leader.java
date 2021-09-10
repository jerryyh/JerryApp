package com.jerry.mobile.designpattern.action.responsibility;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:抽象处理者：领导类
 */
abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }
    //处理请求的方法
    public abstract void handleRequest(int LeaveDays);
}
