package com.alex.kotlin

/**
 *
 * @ProjectName: Kotlin
 * @Package: com.alex.kotlin
 * @ClassName: Dog
 * @Author:  Andy
 * @Date: 2021/4/22 22:33
 * @Version: 1.0.0
 * @Description: 此类用于测试印章类
 */
sealed class Dog {
    class 哈士奇 : Dog()
    class 拉布拉多 : Dog()

    fun sayHello() {
        println("hello hello how are you")
    }
}