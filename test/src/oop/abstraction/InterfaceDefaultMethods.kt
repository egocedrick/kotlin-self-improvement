package oop.abstraction

// Interface with default method
interface Chargeable{
    val capacity: Int

    // Default Implementation
    fun charge() {
        println("Charging device... Capacity: $capacity mAh")
    }
}

// Class implementing interface but using default method
class PowerBank(override val capacity: Int): Chargeable

// Class overriding the default method
class SmartPhone(override val capacity: Int): Chargeable {
    override fun charge() {
        println("Smartphone charging fast ... Capacity $capacity mAh")
    }
}

fun main() {
    val powerBank =  PowerBank(2000)
    powerBank.charge()   // uses default implementation

    val phone = SmartPhone(50000)
    phone.charge()    // uses overridden implementation
}