package fundamentals.inputhandling

fun main() {
    println("=========Simple Menu==========")

    println("1. Greet User")
    println("2. Show current Day")
    println("3. Exit")
    println("Enter your number: ")
    val choice = readLine()
        val choices = choice?.toIntOrNull()?: 0
    val result = when(choices){
        1 -> "Welcome, John"
        2 -> "Today is Saturday"
        3 -> "Exiting program"
        else -> "Invalid number"
    }
    println(result)
}
