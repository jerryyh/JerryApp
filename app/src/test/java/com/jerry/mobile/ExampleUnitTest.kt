package com.jerry.mobile

import com.jerry.mobile.bean.Person
import com.jerry.mobile.bean.TestJava
import com.jerry.mobile.bean.TestKotlin
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testSample(){
        println(TestJava.method().toString())
        println(TestKotlin.method())
    }

    @Test
    fun testCity(){
        print(TestJava.getCity().toString()+"\n" )
        print(TestKotlin.getCity())
    }

    @Test
    fun splictStrings(){
        val x = 4
        val y = 7
        print("sum of $x and $y is ${x + y} \n" )
        print(TestKotlin.splictStrings())
        print(TestJava.splictStrings())
    }

    @Test
    fun testScope(){
        R.drawable.scope

        val tom=Person(name = "tom").apply {
            age=29
            city="上海"
        }
        print(tom)
        print("\n" )
        val p=Person(name="tom").run {
            age =29
            city="上海"
            "$name $age $city"//最后一行自定义返回
        }
        print(p)
        print("\n" )
        var jerry=Person(name="jerry").also {
            it.city="武汉"
        }
        print(jerry)
        print("\n" )
        var marry=Person(name="marry").let {item->{
            item.city="深圳"
            3//最后一行自定义返回
        }

        }
        print(marry)
        print("\n" )
        //不是扩展函数，是独立函数
       var mark= with(Person(name="mark")){
            city="广州"
            3//最后一行返回可以自定义
        }
        print(mark)

    }
}