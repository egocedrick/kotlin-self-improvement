package oop.encapsulation

// Purpose: Show one class encapsulating another (has-a relationship)

class Engine(private val horsepower: Int) {
    fun getHorsepower() = horsepower
}

class Car(private val brand: String, private val engine: Engine) {
    fun carInfo(): String {
        return "$brand car with ${engine.getHorsepower()} HP Engine"
    }
}

fun main() {
    val engine = Engine(150)
    val car = Car("Toyota", engine)

    println(car.carInfo())
}