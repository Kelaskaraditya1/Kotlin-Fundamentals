package com.starkindustries.kotlinlanguagebasics.Kotlin.OOPS
enum class Family(name:String,age:Int,phoneNo:String,education:String)
{
    SON("Aditya",21,"8591059220","BE"),
    FATHER("Sandeep",51,"9819375722","12th Pass"),
    MOTHER("Sanjana",46,"9619074548","10th Pass"),
    SISTER("Aakansha",30,"5689456545","CA")
}

fun main() {
    for(member in Family.values())

        println("${member.name} ")
}