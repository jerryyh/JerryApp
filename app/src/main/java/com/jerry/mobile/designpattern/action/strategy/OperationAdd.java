package com.jerry.mobile.designpattern.action.strategy;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:实现接口的实体类
 */
public class OperationAdd implements IStrategy {


    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
