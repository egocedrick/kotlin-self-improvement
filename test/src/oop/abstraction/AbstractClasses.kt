    package oop.abstraction

// Abstract blueprint
abstract class Authenticator {
    abstract fun login(username: String, password: String): Boolean

    // Connecting method - optional
    fun showWelcomeMessage() {
        println("Welcome to Secure App")
    }
}

// Password-based authentication
class PasswordAuth: Authenticator() {
    override fun login(username: String, password: String): Boolean {
        return username == "Admin" && password == "1234"
    }
}

// Finger-based authentication
class FingerprintAuth: Authenticator() {
    override fun login(username: String, password: String): Boolean {
        println("Fingerprint scan successful for $username")
        return true
    }
}


fun main() {
    val passwordAuth: Authenticator = PasswordAuth()
    val fingerprintAuth: Authenticator = FingerprintAuth()
    passwordAuth.showWelcomeMessage()
    println()

    println("Password authentication login: " + passwordAuth.login("Admin", "1234"))
    println("Fingerprint authentication login: " + fingerprintAuth.login("John", ""))
}