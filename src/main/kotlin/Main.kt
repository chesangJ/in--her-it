fun main() {
    var car=Car("Benz","Suv","maroon",6)
    car.carry(3)
    car.identity()
    var bus=Bus("toyota","es60","black",12)

    var x=bus.maxTripFare(100.06)
    println(x)



}
 open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int,){
       var x=people-capacity
        if (people<=(capacity))
            println("Carrying $people passangers")
        else if(people>capacity)
            println("Over capacity by $x people")

    }
    fun identity(){
        println("I am a $color $make $model")

    }
    open fun  calculateParkingFees(hours:Int):Int{
        return hours*20

    }
}
class Bus (make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double){
        var cal= capacity* fare
        return cal
    }

    override fun calculateParkingFees(hours: Int): Int {
        var mon= hours*capacity
        return mon

    }
}
