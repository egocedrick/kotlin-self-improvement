package review.second

fun main() {
    val input: List<Int> = listOf(85,92,76,88,95,70)
    var totalScore = 0
    var highScore = input[0]
    var lowScore = input[0]
    var countPassed = 0

    for (x in input){
        totalScore += x
        if (x > highScore){
            highScore = x
        }
        if (x < lowScore){
            lowScore = x
        }
        if (x >= 75){
            countPassed++
        }
    }
    println("Total Score: $totalScore")
    println("Highest Score: $highScore")
    println("Lowest Score: $lowScore")
    println("Count of passing (>= 75): $countPassed")
}