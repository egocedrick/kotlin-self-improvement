package oop.abstraction

// Abstract class base
abstract class BaseDevice(val deviceName: String) {
    abstract fun startUp()
    open fun showInfo() {
        println("Device Name: $deviceName")
    }
}

// Interfaces
interface Patchable {
    fun applyPatch()
}

interface LockFeature{
    fun enableLock()
    fun disableLock()
}

// Child class combining abstract '+' interfaces
class SmartGadget(deviceName: String) : BaseDevice(deviceName), Patchable, LockFeature {
    override fun startUp() {
        println("$deviceName: Starting system...")
    }

    override fun applyPatch() {
        println("$deviceName: Applying latest patch...")
    }

    override fun enableLock() {
        println("$deviceName: Lock enabled!")
    }

    override fun disableLock() {
        println("$deviceName: Lock disabled!")
    }
}

fun main() {
    val myGadget = SmartGadget("Pixel Secure 2026")
    myGadget.showInfo()
    myGadget.startUp()
    myGadget.applyPatch()
    myGadget.enableLock()
    myGadget.disableLock()
}