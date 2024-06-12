package com.starkindustries.kotlinlanguagebasics.OOPS
// Default constructor
open class User
{
    lateinit var sid:String
    lateinit var name:String
    var roll_no=0
    lateinit var department:String

    fun print_user()
    {
        println("The name of the user is:"+name)
        println("The Student-Id of the User is:"+sid)
        println("The roll no of the user is:"+roll_no)
        println("The department of the user is:"+department)
    }
    constructor(sid_:String,name_:String,roll_no_:Int,department_:String)
    {
        this.sid=sid_
        this.name=name_
        this.roll_no=roll_no_
        this.department=department_
    }
    constructor(name_:String,roll_no_:Int,department_:String)
    {
        this.name=name_
        this.roll_no=roll_no_
        this.department=department_
    }
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>)
        {
            val obj1=User("2021FHCO042","Aditya Kelaskar",54,"Computer")
            obj1.print_user()
            val obj2=User("Mayur",56,"computer")
            obj2.print_user()
        }
    }

}

