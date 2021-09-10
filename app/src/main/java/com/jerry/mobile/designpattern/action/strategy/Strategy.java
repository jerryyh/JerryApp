package com.jerry.mobile.designpattern.action.strategy;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public class Strategy {
    private IStrategy iStrategy;

    public Strategy(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }
    public int executeStrategy(int num1, int num2){
        return iStrategy.doOperation(num1, num2);
    }
}

/**
 * 工厂模式是一种创造模式。战略模式是一种运营模式。换句话说，工厂模式用于创建特定类型的对象。
 * 策略模式用于以特定方式执行一个操作（或一组操作）。
 * 在经典示例中，工厂可能会创建不同类型的动物：狗，猫，老虎，
 * 而策略模式将执行特定的动作，例如，移动；使用“跑步”，“步行”或“移动”策略。
 */
