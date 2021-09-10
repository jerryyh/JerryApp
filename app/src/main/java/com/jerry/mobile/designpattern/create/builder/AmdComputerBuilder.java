package com.jerry.mobile.designpattern.create.builder;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:AMD电脑 建造者
 */
public class AmdComputerBuilder extends AbstractComputerBuilder {
    private Computer computer=new Computer();
    @Override
    void buildCPU() {
        computer.setCpu("2700x");
    }

    @Override
    void buildMotherboar() {
        computer.setMotherboar("华硕 ROG X470");
    }

    @Override
    void buildRam() {
        computer.setRam("芝奇 DDR4 8G");
    }

    @Override
    void buildGraphicsCard() {
        computer.setGraphicsCard("vega 56");
    }

    @Override
    void buildPower() {
        computer.setPower("EVGA 750W");
    }

    @Override
   public Computer getComputer() {
        return computer;
    }
}
