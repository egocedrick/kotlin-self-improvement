package review.third

fun main() {
    var outerChoice: Int
    do {
        println("\nOuter Menu")
        println("1 - Inner Loop")
        println("2 - Exit")
        print("Enter choice: ")

        outerChoice = readLine()?.toIntOrNull() ?: -1
        if (outerChoice == 1) {
            var innerChoice: Int
            do {
                println("Inner Menu: 1-Print Hello, 2-Back")
                innerChoice = readLine()?.toIntOrNull() ?: -1
                when (innerChoice) {
                    1 -> println("Hello from inner loop!")
                    2 -> println("Returning to outer menu.")
                    else -> println("Invalid choice, try again.")
                }
            }
            while (innerChoice != 2)
        }
    }
    while (outerChoice != 2)
    println("Exited program.")
}