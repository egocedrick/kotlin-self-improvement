package review.third

fun main() {
    print("Enter N: ")
    val n = readLine()?.toIntOrNull() ?: 0
    var i = 1
    if (n > 0) {
        do {
            println(i)
            i++
        } while (i <= n)
    }else{
        println("Invalid input. Please enter a positive number.")
    }
}