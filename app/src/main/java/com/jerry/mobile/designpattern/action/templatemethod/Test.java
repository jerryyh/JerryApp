package com.jerry.mobile.designpattern.action.templatemethod;

/**
 * @author jerry
 * @date 2021/5/26
 * Description:
 */
class Test {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}

/**
 *优点
 *
 * 通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，不同的子类可以提供不同的实现，符合开放-封闭和单一职责原则。
 * 模板方法模式通过把不变的行为搬移到父类，去除了子类中的重复代码，也无需客户端去实现具体的模板逻辑，减少了代码量，提高了代码复用。
 *
 * 缺点
 *
 * 父类中可变的基本方法太多，会导致系统类剧增，此时可以考虑结合使用桥接模式。
 *
 *
 *
 * 作者：長安
 * 链接：https://juejin.cn/post/6871270815095062536
 * 来源：掘金
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */
