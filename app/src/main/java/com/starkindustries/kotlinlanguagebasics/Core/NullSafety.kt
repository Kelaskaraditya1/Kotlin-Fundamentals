package com.starkindustries.kotlinlanguagebasics.Core

fun main(){
    var name:String? =null
    name?.let{
        println("My name is:$")
    }

    // similar to ternary operator like if value is not null than it will take the value provide else it will take the default value which is provided.
    var getName = name?:"Aditya"
    println("The name is:$getName")

}