package com.starkindustries.kotlinlanguagebasics.OOPS.Inheritance
open class Vehicle(engineNo:String)
{
    lateinit var engineNo:String
    init
    {
        this.engineNo=engineNo
    }
   open fun startVehicle()
    {
        println("vehicle started")
    }
    open fun printEngineNo()
    {
        println("The EngineNo is:"+this.engineNo)
    }
    fun printInfo()
    {
        this.printEngineNo()
    }
}
class Car(engineNo: String,carName:String,registrationNo:String):Vehicle(engineNo)
{
    lateinit var carName:String
    lateinit var registrationNo:String
    lateinit var carEngineNo:String
    init
    {
        this.carName=carName
        this.registrationNo=registrationNo
        this.carEngineNo=engineNo
    }
    fun gearChange(gearFrom:Int,gearTo:Int)
    {
        super.startVehicle()
        println("Gear shifted from "+gearFrom+" to "+gearTo)
    }
    fun carAccelerated(speed:Int)
    {
        println("Car accelarated by "+speed+"km/hr")
    }
    fun stop()
    {
        println("Car Stopeed")
    }

    override fun printEngineNo() {
        super.printEngineNo()
        println("Name of the Car is:"+this.carName)
        println("Registration no of the Car is:"+this.registrationNo)
        println("Engine no of the Car is:"+this.engineNo)
    }
    companion object
    {
        @JvmStatic
        fun main(args:Array<String>)
        {
            val vehicle = Vehicle("2021FHCO042")
            vehicle.printEngineNo()
            vehicle.startVehicle()
            val car = Car("2021FHCO054","Astin Martin","2021FHCO042")
            car.printInfo()
            car.gearChange(1,2)
            car.carAccelerated(200)
            car.stop()
        }
    }
}