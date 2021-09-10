package com.jerry.mobile.designpattern.action.observer;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:抽象被观察者
 */
public interface Subject {
    /**
     * 增加订阅者
     */
    public  void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     * @param message
     */
    public void notify(String message);
}
