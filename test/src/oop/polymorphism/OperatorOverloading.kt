package oop.polymorphism

data class Vector(val x: Int, val y: Int) {

    // Overloading the '+' operator
    operator fun plus(other: Vector): Vector {
        return Vector(this.x + other.x, this.y + other.y)
    }

    // Overloading the '-' operator
    operator fun minus(other: Vector): Vector {
        return Vector(this.x - other.x, this.y - other.y)
    }
}

fun main() {
    val v1 = Vector(2,3)
    val v2 = Vector(4,1)

    // Using overloaded operators
    val sum = v1 + v2  // Calls operator for plus
    val diff = v1 + v2 // Calls operator for minus

    println("Sum: $sum")
    println("Diff: $diff")
}