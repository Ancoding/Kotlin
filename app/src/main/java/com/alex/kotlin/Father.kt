package com.alex.kotlin

/**
 *
 * @ProjectName: Kotlin
 * @Package: com.alex.kotlin
 * @ClassName: Father
 * @Author:  Andy
 * @Date: 2021/4/20 22:19
 * @Version: 1.0.0
 * @Description: 此类用于父类
 */
open class Father {
    open var chactor:String="素质不高，喜欢公共场合大喊大叫"
    open fun action(){
        println(chactor)
    }
}