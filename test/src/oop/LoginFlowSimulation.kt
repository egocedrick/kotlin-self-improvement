package oop

import java.util.UUID

open class BaseAuth(
    protected val userName: String,
    protected val password: String,
)

// Logic Layer
interface LogIn{
    fun loginMethod() : LoginResult

}

sealed class LoginResult {
    data class Success(val message: String) : LoginResult()
    data class Error(val message: String) : LoginResult()
    data class Locked(val message: String) : LoginResult()
    data class Loading(val message: String) : LoginResult()
    data class Expired(val message: String) : LoginResult()
}

// UI Layer
fun eventMessage(event: LoginResult) {
    when(event) {
        is LoginResult.Success -> println(event.message)
        is LoginResult.Error -> println(event.message)
        is LoginResult.Locked -> println(event.message)
        is LoginResult.Loading -> println(event.message)
        is LoginResult.Expired -> println(event.message)
    }
}

class Authentication(userName: String, password: String, private val users: Map<String, String>): BaseAuth(userName, password), LogIn {

    private var failedAttempt = 0

    override fun loginMethod(): LoginResult {
        val storedPassword = users[userName]
        return if (storedPassword == null){
            LoginResult.Error("User not found!")
        } else if (storedPassword == password) {
            LoginResult.Success("Login Successful")
        } else {
            failedAttempt++
            if (failedAttempt >= 3) {
                LoginResult.Locked("Account locked due to many failed attempts")
            } else {
                LoginResult.Error("Invalid credentials!: Attempt $failedAttempt")
            }
        }
    }
}

class APIAuth(userName: String, password: String, private val users: Map<String, String>) : BaseAuth(userName, password), LogIn {
    private var failedAttempt = 0
    private var expired = false
    private var token: String? = null

    fun refreshToken(): LoginResult {
        token = UUID.randomUUID().toString()
        expired = false
        return LoginResult.Success("Token refresh! New token: $token")
    }

    override fun loginMethod(): LoginResult {
        println("Connecting to Server....")
        val loading = LoginResult.Loading("Please wait authenticating...")
        println(loading.message)

        val storedPassword = users[userName]
        if (storedPassword == null) {
            return LoginResult.Error("User not found!")
        }
        if (storedPassword != password) {
            failedAttempt++
            return if (failedAttempt >= 3) {
                LoginResult.Locked("Account locked due to many attempts")
            } else {
                LoginResult.Error("API login failed!: Attempt $failedAttempt")
            }
        }

        return if (!expired) {
            token = UUID.randomUUID().toString()
            expired = true
            LoginResult.Success("API Login successful: Token $token")
        } else {
            LoginResult.Expired("Session Expired: Please refresh token.")
        }
    }
}

fun main() {
    val users: MutableMap<String, String> = mutableMapOf(
        "Admin" to "1234",
        "John" to "0123",
        "Cedrick" to "4321"
    )

    val auth = Authentication("John", "0123", users)
    eventMessage(auth.loginMethod())
    eventMessage(auth.loginMethod())
    eventMessage(auth.loginMethod())


    val sessions = mutableMapOf<String, APIAuth>()
    sessions["Admin"] = APIAuth("Admin","1234", users)
    sessions["John"] = APIAuth("John","0123", users)
    sessions["Cedrick"] = APIAuth("Cedrick","4321", users)

    println("---- Round 1: Initial Logins ----")
    sessions["Admin"]?.loginMethod()?.let { eventMessage(it) }
    sessions["John"]?.loginMethod()?.let { eventMessage(it) }
    sessions["Cedrick"]?.loginMethod()?.let { eventMessage(it) }

    println("---- Round 2: Expired ----")
    sessions["Admin"]?.loginMethod()?.let { eventMessage(it) }
    sessions["John"]?.loginMethod()?.let { eventMessage(it) }
    sessions["Cedrick"]?.loginMethod()?.let { eventMessage(it) }

    println("---- Round 3: Refresh Admin & Cedrick ----")
    sessions["Admin"]?.refreshToken()?.let { eventMessage(it) }
    sessions["John"]?.refreshToken()?.let { eventMessage(it) }
    sessions["Cedrick"]?.refreshToken()?.let { eventMessage(it) }

    println("---- Round 4: Post-Refresh Logins ----")
    sessions["Admin"]?.loginMethod()?.let { eventMessage(it) }
    sessions["John"]?.loginMethod()?.let { eventMessage(it) }
    sessions["Cedrick"]?.loginMethod()?.let { eventMessage(it) }

    println("---- Round 5: Refresh John ----")
    sessions["Admin"]?.refreshToken()?.let { eventMessage(it) }
    sessions["John"]?.refreshToken()?.let { eventMessage(it) }
    sessions["Cedrick"]?.refreshToken()?.let { eventMessage(it) }

    println("---- Round 6: Final Logins ----")
    sessions["Admin"]?.loginMethod()?.let { eventMessage(it) }
    sessions["John"]?.loginMethod()?.let { eventMessage(it) }
    sessions["Cedrick"]?.loginMethod()?.let { eventMessage(it) }
}