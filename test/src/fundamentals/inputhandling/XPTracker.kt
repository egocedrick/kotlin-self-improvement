package fundamentals.inputhandling

fun main(){
    println("Enter your level: ")
    val currentLevel = readLine()?.toIntOrNull()?:0

    println("Enter your current exp: ")
    val currentExp = readLine()?.toIntOrNull()?:0

    println("Your current level is $currentLevel")
    println("Your current exp is: $currentExp%")
    println("You need to gain: ${100 - currentExp}%")
}