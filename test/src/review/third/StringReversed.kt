package review.third

fun main() {
    var again: String
    do {
        print("Enter a string: ")
        val input = readLine() ?: ""

        println("Reversed: ${input.reversed()}")
        print("Do you want to try again? (yes/no): ")
        again = readLine()?.lowercase() ?: "no"
    }
    while (again == "yes")
}