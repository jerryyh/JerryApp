package com.jerry.mobile.designpattern.create.builder;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public class MyComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;
    public MyComputer(String cpu, String screen, String memory, String mainboard) {
        this.cpu = cpu;
        this.screen = screen;
        this.memory = memory;
        this.mainboard = mainboard;
    }
}
