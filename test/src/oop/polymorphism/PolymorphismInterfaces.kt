package oop.polymorphism

interface Authenticatable{
    fun login(): Boolean
}

class Users(private val password: String) : Authenticatable {
    override fun login(): Boolean = password == "1234"
}

class Admin(private val key: String) : Authenticatable {
    override fun login(): Boolean = key == "MASTER_KEY"
}

fun main() {
    val user = Users("1234")
    val admin = Admin("MASTER_KEY")

    println("User login: ${user.login()}")
    println("Admin logic: ${admin.login()}")
}