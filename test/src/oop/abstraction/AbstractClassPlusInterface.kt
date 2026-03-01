package oop.abstraction

// Abstract base class
abstract class MobileDeviceV2(val model: String) {
    abstract fun boot()
    open fun info() {
        println("Device Model: $model")
    }
}

// Interfaces
interface SecureableV3 {
    fun applySecurityPath()
}

interface LockableV3 {
    fun lock()
    fun unlock()
}

// Child class combining abstract '+' interfaces
class SmartPhoneV3(model: String) : MobileDeviceV2(model), SecureableV3, LockableV3 {
    override fun boot() {
        println("$model: Booting up...")
    }

    override fun applySecurityPath() {
        println("$model: Applying latest security patch...")
    }

    override fun lock() {
        println("$model: Device Locked!")
    }

    override fun unlock() {
        println("$model: Device Unlocked!")
    }
}

fun main() {
    val phoneV3 = SmartPhoneV3("Samsung A16 5G")
    phoneV3.info()
    phoneV3.boot()
    phoneV3.applySecurityPath()
    phoneV3.lock()
    phoneV3.unlock()
}