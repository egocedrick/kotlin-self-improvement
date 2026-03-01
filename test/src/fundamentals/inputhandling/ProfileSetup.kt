package fundamentals.inputhandling

fun main(){
    println("Enter your name: ")
    val yourName: String? = readLine()

    println("Enter your age: ")
    val yourAge = readLine()?.toIntOrNull()?:0

    println("Enter your occupation: ")
    val yourWork: String? = readLine()

    println("Here's your profile summary")
    println("Hello, $yourName so you're $yourAge and currently working as $yourWork")
}