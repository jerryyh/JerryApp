package com.jerry.mobile.designpattern.create.builder;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
public class NewMyComputer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public NewMyComputer() {
        throw new RuntimeException("can't init");
    }
    private NewMyComputer (Builder builder){

    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {
        }
        public Builder cpu(String val){
            cpu = val;
            return this;
        }
        public Builder screen(String val) {
            screen = val;
            return this;
        }
        public Builder memory(String val) {
            memory = val;
            return this;
        }
        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }
        public NewMyComputer build() {
            return new  NewMyComputer(this);}
    }
}
