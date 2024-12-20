package com.starkindustries.kotlinlanguagebasics.Core
import android.util.Log

object Employee {
    var eid:String=""
        set(value) {
            if(value.contains("2021FHCO"))
                field=value
            else
                println("Invalid Employee-ID")
        }
     var name:String=""
        set(value) {
            if(value.isEmpty())
                field=value
            else
                println("Invalid Name")
        }
     var department:String=""
         set(value) {
             var departmentList = arrayOf(
                 "Computer",
                 "IT",
                 "AI-DS",
                 "Civil",
                 "Mechanical",
                 "Electrical",
                 "Humanities",
                 "EX-TC")
             if(value in departmentList)
                 field=value
             else
                 println("Invalid Department")
         }


    var salery:Int=0
        set(value) {
            if(value<0)
                println("Invalid Salery,should be greater than 0")
            else
                field=value
        }
}
object Student{
    var name="Aditya"
    var department = "Computer"
    var sid = "20212FHCO042"
    var rollNo=54
    var div = 'A'
    fun printDetails(){
        println("The name of the student is $name")
        println("The department of the student is $department")
        println("The sid of the student is $sid")
        println("The rollNo of the student is $rollNo")
        println("The div of the student is $div")

    }
}
fun main(){
    Student.printDetails()  
}