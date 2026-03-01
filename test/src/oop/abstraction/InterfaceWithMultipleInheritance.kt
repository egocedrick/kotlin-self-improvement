package oop.abstraction

// First interface with abstract + default method
interface Charger{
    fun charge()
    fun plugIn() {
        println("Plugged into power source...")
    }
}

// Second interface with abstract '+' default method
interface USBDevice{
    fun connect()
    fun plugIn() {
        println("Connecting via USB Port...")
    }
}

// Class implementing both interfaces
class SmartphoneV3: Charger, USBDevice {
    override fun charge() {
        println("Smartphone is charging...")
    }

    override fun connect() {
        println("Smartphone connected to PC...")
    }

    // Conflict resolution: must override plugIn()
    override fun plugIn() {
        // You can choose which interface's default method to call
        super<Charger>.plugIn()
        super<USBDevice>.plugIn()
        println("Smartphone handled both plugin behaviors")
    }
}

fun main() {
    val phone = SmartphoneV3()
    phone.charge()
    phone.connect()
    phone.plugIn()
}