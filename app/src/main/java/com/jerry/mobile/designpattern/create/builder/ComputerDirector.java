package com.jerry.mobile.designpattern.create.builder;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:指挥者
 */
public class ComputerDirector {
    public void construct(AbstractComputerBuilder builder){
        builder.buildCPU();
        builder.buildMotherboar();
        builder.buildRam();
        builder.buildGraphicsCard();
        builder.buildPower();
    }
}
