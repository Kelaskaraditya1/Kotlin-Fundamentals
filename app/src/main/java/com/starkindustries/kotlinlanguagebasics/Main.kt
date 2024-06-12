package com.starkindustries.kotlinlanguagebasics
class Main
{
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>)
        {
            // Variables and datatypes

            // Datatypes:
            //Int,String,Char,Double,Float,Long,Boolean

            // Variables:

            // Deceleration:


//            var a: Int
//            var b:String
//            var c:Float
//            var d:Char
//
//            val a:Int
//            val b:String
//            val c:Float


            // Initialization:

            var a=10
            var b="Aditya"
            var c=true
            val g=25
            val d='A'
            val e=65.31
            val f=false
            var name="Aditya"
            var sid="2021FHCO042"
            var department="Computer"

            // Function:


            fun add(a:Int,b:Int):Int
            {
                return a+b
            }
            fun add(a:Int,b:Int,c:Int):Int
            {
                return a+b+c
            }

            // Conditional Statements:


            println("The value of a is $a , The value of b is $b , The value of c is $c")
            println("The value of d is $d , The value of e is $e , The value of f is $f")
            println("I am Ironman")
            println("The sum of a and b is:${add(10,20)}")
            println("The sum of a,b and c is:${add(10,20,30)}")
            println("My name is $name , My department is $department , My Student-Id is $sid")
        }

    }
}
