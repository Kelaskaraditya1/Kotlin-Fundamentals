package com.starkindustries.kotlinlanguagebasics.Collections

import android.view.View

fun main(args:Array<String>)
{
//    // Unmutable lists
//    val unmutableList=listOf("Aditya","Sanjana","Sandeep",21,46,55)
//    for(i  in 0..unmutableList.size-1)
//        print("${unmutableList[i]} ")
//    println()
//    for(i in unmutableList)
//        print("${i} ")
//
//    // Mutable List
//    val mutableList = mutableListOf<Any>()
//    var no:Int = readLine()!!.toInt()
//    for(i in 0..no-1)
//    {
//        var value:String = readln()
//        mutableList.add(value)
//    }
//    for(i in 0..mutableList.size-1)
//        println("${mutableList[i]} ")

    var list = listOf("Aditya","Sanjana","Sandeep",22,47,52)
//    println(list)
//    for(value in list)
//        println("$value ")
    println(list.size)

list.forEach{
    println(it)
}


    
}