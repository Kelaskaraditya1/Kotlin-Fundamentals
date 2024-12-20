package com.starkindustries.kotlinlanguagebasics.Collections

data class User(val id:Int,val name:String)
fun main(args:Array<String>){

    // Filter filters elements on basis of certain conditions
    val list1 = listOf(1,2,3,4,5,6,7,8)
//    var oddFunc:(Int)->Boolean={x->x%2==0}
//    val list2=list1.filter(oddFunc)
//    println(list2)
//    val userList = listOf(User(1,"Aditya"),User(2,"Bade-Bai"),User(3,"Vaishnavi"))
//    println(userList.filter { user->user.id==2 })

    // Map Function iterate through each and every element and transforms as required

    val list3 = list1.map{it->
        it+5
    }
    println(list3)

}