package com.alex.kotlin

/**
 *
 * @ProjectName: Kotlin
 * @Package: com.alex.kotlin
 * @ClassName: Child
 * @Author:  Andy
 * @Date: 2021/4/20 22:21
 * @Version: 1.0.0
 * @Description: 此类用于
 */
class Child : Father() {
    override var chactor: String = "儿子素质很低，喜欢公共场合大小便"
    override fun action() {
        print(chactor)
    }
}