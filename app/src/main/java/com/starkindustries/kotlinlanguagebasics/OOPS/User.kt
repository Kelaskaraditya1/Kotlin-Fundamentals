package com.starkindustries.kotlinlanguagebasics.OOPS
open class User (var sid_:String,var name_:String,var roll_no_:Int,var department_:String)
{
    lateinit var sid:String
    lateinit var name:String
    var roll_no=0
    lateinit var department: String
    init {
     this.sid=sid_
     this.name=name_
     this.roll_no=roll_no_
     this.department=department_
     print_user()
    }
    fun print_user()
    {
        println("The name of the user is:"+name)
        println("The Student-Id of the User is:"+sid)
        println("The roll no of the user is:"+roll_no)
        println("The department of the user is:"+department)
    }
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>)
        {
            User("2021FHCO042","Aditya Kelaskar",54,"Computer")
        }
    }

}

