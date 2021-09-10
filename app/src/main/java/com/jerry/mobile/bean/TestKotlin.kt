package com.jerry.mobile.bean

/**
 * @author jerry
 * @date 2021/5/31
 * Description:
 */
class TestKotlin {

    companion object MyObject {
        fun method():UserKotlin{
            val userKotlin = UserKotlin()
            userKotlin.age=18
            userKotlin.name="jerry"
           return userKotlin
        }

        fun getCity():CityK{
            return CityK("1","武汉")
        }

        fun splictStrings(): String? {
            val x = 4
            val y = 7
            return "sum of " + x + " and " + y + " is " + (x + y)
        }

        fun describe(obj: Any): String =
            when(obj){
                1->"one"
                2->"two"
                else -> "other"
            }
    }
}