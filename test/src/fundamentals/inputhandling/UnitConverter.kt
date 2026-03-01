package fundamentals.inputhandling

fun main(){
    println("Enter meter: ")
    val sampleMeter = readLine()?.toIntOrNull()?:0

    println("Enter centimeter: ")
    val sampleCM = readLine()?.toIntOrNull()?:0

    println("The value of your meter to centimeter: ${sampleMeter * 100}")
    println("The value of your centimeter to meter: ${sampleCM / 100}")
}