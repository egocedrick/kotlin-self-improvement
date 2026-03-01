package oop

import kotlin.math.log

// Sealed class to group all auth events
sealed class AuthEvent {

    // Success login
    object LoginSuccess : AuthEvent()

    // Failed login
    data class LoginFailure(val reason: String) : AuthEvent()

    // Token session expired
    object TokenExpired : AuthEvent()
}

// Function to log events
fun logAuthEvent(event: AuthEvent) {
    when(event) {
        is AuthEvent.LoginSuccess -> println("LOG: User login successful.")
        is AuthEvent.LoginFailure -> println("LOG: Login Failed ${event.reason}")
        is AuthEvent.TokenExpired -> println("LOG: Session token expired")
    }
}

// Example usage
fun main() {
    val successEvent = AuthEvent.LoginSuccess
    val failureEvent = AuthEvent.LoginFailure("invalid password")
    val expiredEvent = AuthEvent.TokenExpired

    logAuthEvent(successEvent)      // Success log
    logAuthEvent(failureEvent)      // Failed log
    logAuthEvent(expiredEvent)      // Expired log
}