package com.starkindustries.kotlinlanguagebasics.Kotlin.OOPS.Inheritance
open class Parent(name_:String,age_:Int,education_:String,phone_no_:String)
{
    open lateinit var name:String
    open var age:Int=0
    open lateinit var education:String
    open lateinit var phone_no:String
    init
    {
        this.name=name_
        this.age=age_
        this.education=education_
        this.phone_no=phone_no_
    }
    open fun display_info()
    {
        println("My name is:"+this.name)
        println("My age is:"+this.age)
        println("My Education is:"+this.education)
        println("You can call me on:"+this.phone_no)
    }

}
class Son(name:String,fathers_name_:String,age:Int,education:String,phone_no: String):
    Parent(name,age,education,phone_no)
{
     lateinit var son_name:String
    lateinit var fathers_namme:String
     var son_age:Int=0
     lateinit var son_education:String
    lateinit var son_phone_no:String
    init
    {
        this.son_name=name
        this.fathers_namme=fathers_name_
        this.son_age=age
        this.son_education=education
        this.son_phone_no=phone_no
    }

    override var name: String=son_name
    override fun display_info()
    {
        display_info()
        println("My Fathers name is:"+fathers_namme)
    }
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>)
        {
            val Sandeep = Parent("Sandeep",51,"12th Pass","9819375722")
            Sandeep.display_info()
            val Aditya = Son("Aditya","Sandeep",21,"Be","8591059220")
            Aditya.display_info()
        }
    }
}
