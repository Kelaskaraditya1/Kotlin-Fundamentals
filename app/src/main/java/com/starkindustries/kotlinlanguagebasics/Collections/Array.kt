package com.starkindustries.kotlinlanguagebasics.Collections

fun main() {

    // Deceleration of Array
 var arr1 = arrayOf("Aditya","Sanjana","Sandeep","Kelaskar")
 var arr2:Array<Int> = arrayOf(1,2,3,4,5)

    // iterating through Array
 for(i in arr2)
     println(i)

    // can get both index as well as value
    for((index,element) in arr1.withIndex())
        println("The element at index $index is $element")
}