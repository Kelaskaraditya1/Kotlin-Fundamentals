package com.starkindustries.kotlinlanguagebasics.Kotlin.OOPS
class CompanionClass
{
    val a=10
    fun add(a:Int,b:Int):Int
    {
        return a+b
    }
    companion object
    {
        val b=20
        fun product(a:Int,b:Int):Int
        {
            return a*b
        }
        @JvmStatic
        fun main(args: Array<String>)
        {
            val companion = CompanionClass()
            println("The value of a is:"+companion.a)
            println("The value of sum is:"+companion.add(10,20))
            println("The value of b is:"+ b)
            println("The value of product is:"+ product(10,20))
        }
    }

}