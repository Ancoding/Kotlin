package com.alex.kotlin

/**
 *
 * @ProjectName: Kotlin
 * @Package: com.alex.kotlin
 * @ClassName: Man
 * @Author:  Andy
 * @Date: 2021/4/21 22:19
 * @Version: 1.0.0
 * @Description: 此类用于
 */
class Man(name: String) : Human(name), IMan {
    override fun eat() {
        println("${name}啊啊的大口吃")
    }

    override fun pee() {
        println("${name}站着尿尿")
    }
}