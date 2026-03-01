package oop.abstraction

// Interfaces 1
interface SecureableV2 {
    fun applySecurityPatch()

    // Default method: log patch version
    fun status() {
        println("Securable: Security Status checked")
    }
}

// Lock-related interface
interface LockableV2 {
    fun lock()
    fun unlock()

    // Default method: logs lock state
    fun status() {
        println("Lockable: Lock status checked.")
    }
}

// Child class implementing multiple interfaces
class SmartPhoneV2(
    val model: String
): SecureableV2, LockableV2 {
    override fun applySecurityPatch() {
        println("$model: Applying latest security patch...")
    }

    override fun lock() {
        println("$model: Device Locked!")
    }

    override fun unlock() {
        println("$model: Device Unlocked!")
    }

    // Conflict resolution for status()
    override fun status() {
        super<SecureableV2>.status()
        super<LockableV2>.status()
        println("$model, Combined security + lock status resolved")
    }
}

fun main() {
    val myPhone = SmartPhoneV2("Samsung A16 5G")

    // Securable reference
    val secureRef: SecureableV2 = myPhone
    secureRef.applySecurityPatch()

    // Lockable reference
    val locked: LockableV2 = myPhone
    locked.lock()
    locked.unlock()
    locked.status()
}