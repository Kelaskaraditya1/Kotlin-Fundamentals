package com.starkindustries.kotlinlanguagebasics.Kotlin.OOPS
val add={a:Int,b:Int->a+b}
val printme = {println("I am Ironman")}
fun higherOrderOne(param:()->Unit)
{
    param()
}
fun higherOrderSecond(sum:(Int,Int)->Int)
{
    println("The sum of a and b is:"+sum(5,6))
}
fun main(args:Array<String>)
{
    higherOrderOne(printme)
    higherOrderSecond(add)
}