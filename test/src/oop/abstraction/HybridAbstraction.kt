package oop.abstraction

// Abstract class = blueprint + optional concrete method
abstract class Device(val model: String, val osVersion: String) {
    abstract fun boot()     // obligation for child classes
    fun showSpecs() {       // concrete method, inherited by all children
        println("Model: $model, OS: $osVersion")
    }
}

// Interfaces = pure contract
interface Secureable {
    fun applySecurityPatch()
}

// Hybrid child = extends abstract class '+' implemented interfaces
class MobileDevice(
    model: String,
    osVersion: String
    ) : Device(model,osVersion), Secureable {
    override fun boot() {
        println("Booting mobile device...")
    }

    override fun applySecurityPatch() {
        println("Apply latest security patch...")
    }
    }

fun main() {
    // Polymorphic usage: parent reference + child object
    val phone: Device = MobileDevice("Samsung A16 5G", "Android 16")
    phone.showSpecs()           // inherited concrete method
    phone.boot()                // child implementation of abstract method

    // Interface reference -> same object casted
    val securePhone: Secureable = phone as Secureable
    securePhone.applySecurityPatch()    // enforced contract method
}