package com.jerry.mobile.designpattern.struct.facade;

/**
 * @author jerry
 * @date 2021/5/25
 * Description:
 */
public class Facade {
    private Light light1,light2,light3;
    private Heater heater;
    private TV tv;

    public Facade() {
        light1=new Light();
        light2=new Light();
        light3=new Light();
        heater=new Heater();
        tv=new TV();
    }
    public void open(){
        light1.open();
        light2.open();
        light3.open();
        heater.open();
        tv.open();
    }
}
/**
 * 五、模式的优缺点
 *
 * 优点：
 *
 * 对客户屏蔽子系统组件，减少了客户处理的对象数目并使得子系统使用起来更加容易。通过引入门面模式，客户代码将变得很简单，与之关联的对象也很少。
 * 实现了子系统与客户之间的松耦合关系，这使得子系统的组件变化不会影响到调用它的客户类，只需要调整外观类即可。
 * 降低了大型软件系统中的编译依赖性，并简化了系统在不同平台之间的移植过程，因为编译一个子系统一般不需要编译所有其他的子系统。一个子系统的修改对其他子系统没有任何影响，而且子系统内部变化也不会影响到外观对象。
 * 只是提供了一个访问子系统的统一入口，并不影响用户直接使用子系统类。
 * 缺点：
 *
 * 不能很好地限制客户使用子系统类，如果对客户访问子系统类做太多的限制则减少了可变性和灵活性。
 * 在不引入抽象外观类的情况下，增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。
 * ————————————————
 *
 */


