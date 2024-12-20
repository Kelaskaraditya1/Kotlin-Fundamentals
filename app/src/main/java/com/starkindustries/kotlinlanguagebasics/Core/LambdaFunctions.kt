package com.starkindustries.kotlinlanguagebasics.Core
fun main(args:Array<String>)
{
//    val sum={x:Int,y:Int->x+y}
//    val product:(Int,Int)->Int={a,b->a*b}
//    val print={println("I am Ironman")}
//    val printName:(String)->Unit={x->println("My name is:$x")}
//    val printDifference={a:Int,b:Int->println("The Difference is:${a-b}")}
//    println(sum(1,2))
//    println(product(10,10))
//    print()
//    printName("Aditya")
//    printDifference(10,5)
    var sum:(Int,Int)->Int={a,b->a+b}
    var difference:(Int,Int)->Int={a,b->a-b}
    var print:(String)->Unit={ name->println("My name is:$name") }
    println(sum(1,2))
    println(difference(20,10))
    print("Aditya")
}
