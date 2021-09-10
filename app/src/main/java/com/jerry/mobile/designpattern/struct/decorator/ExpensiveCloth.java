package com.jerry.mobile.designpattern.struct.decorator;

/**
 * @author jerry
 * @date 2021/5/24
 * Description:继承PersonCloth实际装饰类
 */
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }
    /**
     * 穿短袖
     */
    private void dressShirt(){
        System.out.println("穿件短袖");
    }

    /**
     * 穿皮衣
     */
    private void dressLeather(){
        System.out.println("穿件皮衣");
    }

    /**
     * 穿牛仔裤
     */
    private void dressJean(){
        System.out.println("穿条牛仔裤");
    }
    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
