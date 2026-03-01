package review.third

fun main() {
    var response: String
    do {
        print("Do you want to continue? (yes/no): ")
        response = readLine()?.lowercase() ?: ""
        if (response != "yes" && response != "no") {
            println("Invalid input, please type yes or no.")
        }
    }
    while (response != "yes" && response != "no")
    println("You chose: $response")
}