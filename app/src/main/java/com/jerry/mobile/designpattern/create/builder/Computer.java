package com.jerry.mobile.designpattern.create.builder;

/**
 * @author jerry
 * @date 2021/5/25
 * Description:产品(电脑)
 */
public class Computer {
    /**
     * cpu
     */
    private String cpu;

    /**
     * 主板
     */
    private String motherboar;

    /**
     * 内存
     */
    private String ram;

    /**
     * 显卡
     */
    private String graphicsCard;

    /**
     * 电源
     */
    private String power;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboar() {
        return motherboar;
    }

    public void setMotherboar(String motherboar) {
        this.motherboar = motherboar;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }


}
/**
 * 建造者模式包含如下角色：
 *
 * Builder：抽象建造者
 * ConcreteBuilder：具体建造者
 * Director：指挥者
 * Product：产品
 *
 * 电脑是每个程序员的标配，主要配件有：CPU、主板、内存、显卡、电源。当前主要有两大平台：AMD 和 Intel，
 * 但是两个平台的一些零件是不一样的。所以肥宅在组装两个平台时选择的配件也是不一样的。
 */
