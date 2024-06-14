package com.starkindustries.kotlinlanguagebasics.Kotlin.OOPS.Inheritance
interface Mathematics
{
    fun sum(a:Int,b:Int):Int
    fun difference(a:Int,b:Int):Int
    fun product(a:Int,b:Int):Int
    fun ratio(a:Int,b:Int):Float
}
open class Calculator: Mathematics
{
    override fun sum(a: Int, b: Int): Int {
        return a+b
    }

    override fun difference(a: Int, b: Int): Int {
        return a-b
    }

    override fun product(a: Int, b: Int): Int {
        return a*b
    }

    override fun ratio(a: Int, b: Int): Float {
        return a/b.toFloat()
    }
}
class ScientiificCalculator: Calculator()
{
    fun square(a:Int):Double
    {
        return Math.pow(a.toDouble(), 2.0)
    }
    fun cube(a:Int):Double
    {
        return Math.pow(a.toDouble(),3.0)
    }
    fun squareRoot(a:Int):Double
    {
        return Math.pow(a.toDouble(),0.5)
    }
    fun cubeRoot(a:Int):Double
    {
        return Math.pow(a.toDouble(),(0.3333).toDouble())
    }
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>)
        {
            val calculator = Calculator()
            val sciCalculator = ScientiificCalculator()
            println("The Sum of a and b is:"+calculator.sum(1,2))
            println("The difference of a and b is:"+calculator.difference(10,5))
            println("The product of a and b is:"+calculator.product(10,20))
            println("The Ratio of a and b is:"+calculator.ratio(10,2))
            println("The Square of a is:"+sciCalculator.square(10))
            println("The Cube of a is:"+sciCalculator.cube(10))
            println("The Square root of a is:"+sciCalculator.squareRoot(64))
            println("The Cuberoot of a is:"+sciCalculator.cubeRoot(125))
        }
    }
}