package com.jerry.mobile.designpattern.struct.bridge;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:桥接模式
 */
public abstract  class Abstraction {
    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operation();
    }
}
