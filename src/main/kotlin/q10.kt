class Car(com:String, year:Long, price:Int, owner:String, miles:Int,cprice:Int){
    var ty:String = com
    var yr =year
    var p:Int = price
    var ow = owner
    var m:Int = miles
    var cp:Int=cprice
    init{
        println("Object is created and Init is called")
    }



    fun getCarPrice(){
        println("$" + (p-m).toString())
    }
    fun getCarInformation(){
        println("Car Information :$ty,$yr")
        println("Car Owner :$ow")
        println("Miles drive :$m")
        println("Original Car Price : $p")
        println("Current Car Price : $cp")
    }
}
fun main() {

    println("Creating class car object car1:")
    var car1=Car("BMW",2016,700,"Satya",870,200)
    car1.getCarInformation()
    println("--------------")

    println("Creating class car object car2:")
    var car2=Car("Audi",2014,900,"Laxman",605,340)
    car2.getCarInformation()


}