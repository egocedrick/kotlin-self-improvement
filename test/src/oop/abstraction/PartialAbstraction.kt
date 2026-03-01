package oop.abstraction

import java.sql.Ref

// Abstract class with partial abstraction
abstract class Appliance {
    abstract val brand: String          // Abstract property (must be implemented)
    abstract fun operate()              // Abstract method (must be implemented)

    // Concrete method (shared logic)
    fun plugIn() {
        println("$brand appliance is now: plugged in.")
    }

    // Concrete property
    val warrantyYears: Int = 2
}

// Child class must implement abstract members but can reuse concrete ones
class WashingMachine(override val brand: String): Appliance() {
    override fun operate() {
        println("$brand washing machine is washing clothes...")
    }
}

class Refrigerator(override val brand: String): Appliance() {
    override fun operate() {
        println("$brand refrigerator is cooling food...")
    }
}

fun main() {
    val wm = WashingMachine("Samsung")
    wm.plugIn()                 // Uses concrete method
    wm.operate()                // implements abstract method
    println("Warranty ${wm.warrantyYears} years!")

    println()

    val ref = Refrigerator("LG")
    ref.plugIn()
    ref.operate()
    println("Warranty ${ref.warrantyYears} years")

    println()

    println("Polymorphic List of Appliance")        // Polymorphic List
    val appliance: List<Appliance> = listOf(
        WashingMachine("Samsung"),
        Refrigerator("LG"),
    )

    for (a in appliance){
        a.plugIn()          // concrete method
        a.operate()         // abstract method implemented by child
        println("Warranty ${a.warrantyYears} years.")
        println()
    }
}