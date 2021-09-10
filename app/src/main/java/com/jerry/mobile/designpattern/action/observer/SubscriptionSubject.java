package com.jerry.mobile.designpattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:具体被观察者
 * 微信公众号是具体主题（具体被观察者），里面存储了订阅该公众号的微信用户，并实现了抽象主题中的方法：
 */
public class SubscriptionSubject implements Subject {

    //存储订阅公众号的微信用户
    private List<Observer> winxinUserList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        winxinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        winxinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : winxinUserList) {
            observer.update(message);
        }
    }
}
/**
 *3.使用观察者模式的场景和优缺点
 * 使用场景
 * 关联行为场景，需要注意的是，关联行为是可拆分的，而不是“组合”关系。
 * 事件多级触发场景。
 * 跨系统的消息交换场景，如消息队列、事件总线的处理机制。
 * 优点
 * 解除耦合，让耦合的双方都依赖于抽象，从而使得各自的变换都不会影响另一边的变换。
 * https://blog.csdn.net/itachi85/article/details/50773358

 */
