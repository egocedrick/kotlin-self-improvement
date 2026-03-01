package oop.abstraction

// Abstract class with abstract property
abstract class Vehicle {
    abstract val brand: String   // Abstract property
    abstract val wheels: Int     // Abstract property

    // Concrete method
    fun showSpecs() {
        println("Brand: $brand, Wheels: $wheels")
    }
}

// Child class must implement abstract properties
class Car(
    override val brand: String,
    override val wheels: Int): Vehicle() {
    fun drive() {
        println("$brand car with $wheels wheels is driving...")
    }
}

class Motorcycle(
    override val brand: String,
    override val wheels: Int): Vehicle() {
    fun ride() {
        println("$brand motorcycle with $wheels wheels is driving...")
    }
}

fun main() {
    val car = Car("Toyota", 4)
    car.showSpecs()
    car.drive()

    println()

    val bike = Motorcycle("Raider", 2)
    bike.showSpecs()
    bike.ride()
}