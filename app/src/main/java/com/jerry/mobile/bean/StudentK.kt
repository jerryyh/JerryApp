package com.jerry.mobile.bean

/**
 * @author jerry
 * @date 2021/5/31
 * Description:自定义get(),set()方法，使用field表示最近的属性
 */
class StudentK {
    var name="tom"
    get() {
        return field+"nb"
    }
    set(value)  {
        field="Cute$value"
    }
}