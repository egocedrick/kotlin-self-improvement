package review.third

fun main() {
    val target = 7
    var guess: Int

    do {
        print("Guess the number: ")
        guess = readLine()?.toIntOrNull() ?: -1
        when {
            guess < target -> println("Too low, try again.")
            guess > target -> println("Too high, try again.")
        }
    }
    while (guess != target)
    println("Correct! The number was $target.")
}