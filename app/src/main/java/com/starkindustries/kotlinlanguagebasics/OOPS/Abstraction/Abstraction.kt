package com.starkindustries.kotlinlanguagebasics.OOPS.Abstraction
abstract class Calculator
{
    abstract fun add(a:Int,b:Int):Int
    abstract fun difference(a:Int,b:Int):Int
    abstract fun product(a:Int,b:Int):Int
    abstract fun ratio(a:Int,b:Int):Double
}
class Main: Calculator()
{
    override fun add(a:Int, b:Int):Int
    {
        return a+b
    }

    override fun difference(a: Int, b: Int): Int {
        return a-b
    }

    override fun product(a: Int, b: Int): Int {
        return a*b
    }

    override fun ratio(a: Int, b: Int): Double
    {
        return (a/b).toDouble()
    }
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>)
        {
            val main = Main()
            println("The sum of a and b is:"+main.add(10,10))
            println("The difference of a and b is:"+main.difference(10,5))
            println("The Product of a and b is:"+main.product(10,10))
            println("The Ratio of a and b is:"+main.ratio(100,10))
        }
    }

}