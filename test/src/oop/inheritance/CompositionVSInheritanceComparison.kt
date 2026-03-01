package oop.inheritance

// Inheritance (is-a) SportsCar is an Engine
// Composition (has-a) relationship (Car has Engine)
// Composition often preferred for flexibility

open class Engine() {
    fun start() = println("Engine starting...")
}

class SportsCar: Engine() {
    fun drive() = println("SportsCar driving fast!")
}

// Composition (has-a)
class Car(private val engine: Engine) {
    fun drive() {
        engine.start()
        println("Car is driving...")
    }
}

fun main() {

    // Inheritance example
    val sportsCar = SportsCar()
    sportsCar.start()
    sportsCar.drive()

    println("--------------------")

    // Composition example
    val car = Car(Engine())
    car.drive()
}