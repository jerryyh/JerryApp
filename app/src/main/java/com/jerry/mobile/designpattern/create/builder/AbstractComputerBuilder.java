package com.jerry.mobile.designpattern.create.builder;

/**
 * @author jerry
 * @date 2021/5/25
 * Description:抽象工厂
 */
abstract class AbstractComputerBuilder {
    /**
     * 选择CPU
     */
    abstract void buildCPU();

    /**
     * 选择主板
     */
    abstract void buildMotherboar();

    /**
     * 选择内存
     */
    abstract void buildRam();

    /**
     * 选择显卡
     */
    abstract void buildGraphicsCard();

    /**
     * 选择电源
     */
    abstract void buildPower();

    /**
     * 获取电脑
     */
    abstract Computer getComputer();
}
