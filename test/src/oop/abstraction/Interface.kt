package oop.abstraction

// Interface = contract
interface Lockable{
    fun lock()
    fun unlock()
}

// Class implementing the interface
class AppLock: Lockable {
    override fun lock() {
        println("App is now locked!")
    }

    override fun unlock() {
        println("App is now unlocked!")
    }
}

fun main() {
    val lock: Lockable = AppLock()  // interface reference -> concrete class
    lock.lock()
    lock.unlock()
}