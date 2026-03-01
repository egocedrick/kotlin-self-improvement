package review.third

fun main() {
    var sum = 0
    var again: String

    do {
        print("Enter a number: ")
        val num = readLine()?.toIntOrNull()
        if (num != null) {
            sum += num
            println("Current sum: $sum")
        }else{
            println("Invalid input, please enter a number.")
        }
        print("Add another number? (yes/no): ")
        again = readLine()?.lowercase() ?: "no"
    }
    while (again == "yes")
    println("Final sum: $sum")
}