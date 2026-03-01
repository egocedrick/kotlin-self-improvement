package oop.abstraction

import java.util.concurrent.locks.Lock

// Sealed abstract base class
sealed abstract class BaseSecureDevice(val deviceName: String) {
    abstract fun startUp()
    open fun showInfo(){
        println("Secure Device: $deviceName")
    }
}

// Interfaces
interface PatchableV2 {
    fun applyPatch()
}

interface LockFeatureV2 {
    fun enableLock()
    fun disableLock()
}

class SecurePhone(deviceName: String): BaseSecureDevice(deviceName), PatchableV2, LockFeatureV2 {
    override fun startUp() {
        println("$deviceName: Booting securely...")
    }

    override fun applyPatch() {
        println("$deviceName: Security patch applied.")
    }

    override fun enableLock() {
        println("$deviceName: Lock enabled!")
    }

    override fun disableLock() {
        println("$deviceName: Lock Disabled!!")
    }
}

class SecureTabletDevice(deviceName: String): BaseSecureDevice(deviceName), PatchableV2 {
    override fun startUp() {
        println("$deviceName: Tablet starting securely...")
    }

    override fun applyPatch() {
        println("$deviceName: Tablet patch applied...")
    }
}

// Exhaustive when expression

fun handleDevice(device: BaseSecureDevice) {
    when (device){
        is SecurePhone -> {
            device.showInfo()
            device.startUp()
            device.applyPatch()
            device.enableLock()
            device.disableLock()
        }

        is SecureTabletDevice -> {
            device.startUp()
            device.applyPatch()
        }
        // No else needed - the compiler knows all subclasses
    }
}
fun main() {
    val devices: List<BaseSecureDevice> = listOf(
        SecurePhone("Pixel Secure 2026"),
        SecureTabletDevice("Galaxy Tab Secure 2026")
    )

    for (d in devices) {
        handleDevice(d)
    }
}