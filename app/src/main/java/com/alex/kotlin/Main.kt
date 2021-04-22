package com.alex.kotlin

/**
 *
 * @ProjectName: Kotlin
 * @Package: com.alex.kotlin
 * @ClassName: Main
 * @Author:  Andy
 * @Date: 2021/4/20 22:25
 * @Version: 1.0.0
 * @Description: 此类用于测试代码
 */
fun main(args: Array<String>) {
    var father = SmallFather()
    father.wash()
    var dog1 = Dog.哈士奇()
    var dog2 = Dog.拉布拉多()
    dog1.sayHello()
    dog2.sayHello()
}