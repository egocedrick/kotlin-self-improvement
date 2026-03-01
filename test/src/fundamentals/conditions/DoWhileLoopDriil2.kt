fun main(){
    var number: Int? = null

    do {
        println("Enter number 1-10:")
        val userInput: String? = readLine()
        number = userInput?.toIntOrNull() ?: 0

        if (number in 1..10) {
            println("Valid number: $number")
        } else {
            println("Invalid input, try again")
        }

    }
    while (number !in 1..10)
}