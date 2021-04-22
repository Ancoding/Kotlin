package com.alex.kotlin

/**
 *
 * @ProjectName: Kotlin
 * @Package: com.alex.kotlin
 * @ClassName: SmallFather
 * @Author:  Andy
 * @Date: 2021/4/22 22:28
 * @Version: 1.0.0
 * @Description: 此类用于小头爸爸
 */
class SmallFather : IWash by BigSon() {
    override fun wash() {
        println("我是小头爸爸，我洗碗奖励10元钱")
    }
}