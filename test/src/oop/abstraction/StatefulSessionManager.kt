package oop.abstraction

// Abstract class with internal state
abstract class SessionManager {
    var currentState: String = "Idle"

    abstract fun transitionTo(state: String)
    abstract fun reset()
}

// Concrete implementation

class UsedSession : SessionManager() {
    override fun transitionTo(state: String) {
        println("Transitioning from $currentState to $state")
        currentState = state
    }

    override fun reset() {
        println("Resetting session idle")
        currentState = "Idle"
    }

}

// Usage
fun main() {
    val session = UsedSession()
    session.transitionTo("Active")
    session.transitionTo("Expired")
    session.reset()
}