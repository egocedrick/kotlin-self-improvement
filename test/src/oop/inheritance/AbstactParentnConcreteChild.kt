package oop.inheritance

// Abstract parent = cannot be instantiated
// Child must implement abstract methods
// Mix of abstraction '+' inheritance

// Abstract parent
abstract class Shape {
    abstract fun area(): Double     // Abstract method
    fun describe() {
        println("This is a shape")
    }
}

// Concrete child
class Circle(private val radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun main() {
    val circle = Circle(5.0)
    circle.describe()    // Concrete method from parent
    println("Area: ${circle.area()}")  // overridden abstract method
}