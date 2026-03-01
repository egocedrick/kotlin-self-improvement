fun main(){
    println("Enter start: ")
    val startRange = readLine()?.toIntOrNull()?:0

    println("Enter end: ")
    val endRange = readLine()?.toIntOrNull()?:0

    println("Enter step: ")
    val stepRange = readLine()?.toIntOrNull()?:0

    for (number in startRange downTo endRange step stepRange){
        println("Output: $number")
    }
}