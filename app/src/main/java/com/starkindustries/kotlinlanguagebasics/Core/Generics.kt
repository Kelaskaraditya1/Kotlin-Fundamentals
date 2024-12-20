package com.starkindustries.kotlinlanguagebasics.Core
class GenericsClass<T>(value:T)
{
    init
    {
        println("The value is:"+value)
    }
    fun <T>add_a(a:T)
    {
        println("The value of a is:${a}")
    }
 companion object
 {
     @JvmStatic
     fun main(args:Array<String>)
     {
//         val obj=GenericsClass<String>("Aditya")
             val obj = GenericsClass("Aditya")
         obj.add_a("Aditya")
     }
 }
}