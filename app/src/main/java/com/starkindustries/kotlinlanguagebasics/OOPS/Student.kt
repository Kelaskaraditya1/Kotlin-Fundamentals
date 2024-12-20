package com.starkindustries.kotlinlanguagebasics.OOPS

// For demonstration of Getters and Setters
class Student {
    var sid: String = ""
        set(value) {
            if (value.contains("2021FHCO"))
                field = value
            else
                println("Invalid Student Id")
        }

     var name: String=""
        set(value) {
            if(value.toString().isEmpty())
                println("Invalid Name")
            else
                field=value
        }
    var rollNo: Int = 0
        set(value) {
            if (value > 0)
                field = value
            else
                println("Invalid Roll no")
        }
    var department: String = ""
        set(value) {
            var departmentList = arrayOf(
                "Computer",
                "IT",
                "AI-DS",
                "Civil",
                "Mechanical",
                "Electrical",
                "Humanities",
                "EX-TC"
            )
            if (!(value in departmentList))
                println("Invalid Department")
            else
                field = value
        }

    constructor(sid: String, name: String, rollNo: Int, department: String) {
        this.sid = sid
        this.name = name
        this.rollNo = rollNo
        this.department = department
    }

    constructor(sid: String, name: String, department: String) {
        this.sid = sid
        this.name = name
        this.department = department
    }

    fun getInfo(student: Student) {
        println("The Sid of the Student is:${student.sid}")
        print("The Name of the Student is:${student.name}")
        println("The Roll No of the Student is:${student.rollNo}")
        println("The Department of the Student is:${student.department}")
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var aditya:Student = Student("042","",0,"Elex")
            aditya.getInfo(aditya)
        }
    }
}