package review.third

fun main() {
    val password = "secret"
    var input: String
    var attempts = 0
    val maxAttempts = 3

    do {
        print("Enter password: ")
        input = readLine() ?: ""
        attempts++
        if (input != password) {
            println("Wrong password. Attempts left: ${maxAttempts - attempts}")
        }
    }
    while (input != password && attempts < maxAttempts)

    if (input == password){
        println("Access granted.")
    }else{
        println("Access denied. Too many attempts.")
    }
}