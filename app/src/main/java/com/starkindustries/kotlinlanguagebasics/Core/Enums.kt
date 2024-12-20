package com.starkindustries.kotlinlanguagebasics.Core
enum class Family(name:String,age:Int,phoneNo:String,education:String)
{
    SON("Aditya",21,"8591059220","BE"),
    FATHER("Sandeep",51,"9819375722","12th Pass"),
    MOTHER("Sanjana",46,"9619074548","10th Pass"),
    SISTER("Aakansha",30,"5689456545","CA")
}
enum class Days(day:Int,exercise:String){
    SUNDAY(0,"Streching"),
    MONDAY(1,"Swimming"),
    TUESDAY(2,"Yoga"),
    WEDNESDAY(3,"Cardio"),
    THURSDAY(4,"Weights"),
    FRIDAY(5,"Sparring"),
    SATURDAY(6,"Grappling");
}

fun main() {
    for(member in Family.values())
        println("${member.name}")

}