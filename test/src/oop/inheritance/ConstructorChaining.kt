// Parent class
open class Appliance(val brand: String) {
    fun powerOn() {
        println("$brand appliance is now ON.")
    }
}

// Child class
class WashingMachine(brand: String, val capacity: Int) : Appliance(brand) {
    fun wash() {
        println("$brand washing machine with $capacity kg capacity is washing clothes.")
    }
}

// Another Child class
class Refrigerator(brand: String, val liters: Int) : Appliance(brand) {
    fun cool() {
        println("$brand refrigerator with $liters liters capacity is cooling food.")
    }
}

fun main() {
    val laundry = WashingMachine("Samsung", 7)
    laundry.powerOn()
    laundry.wash()

    println("\n---")

    val kitchen = Refrigerator("LG", 300)
    kitchen.powerOn()
    kitchen.cool()
}