fun main(){
    println("====While Loop With Validation====")
    var userNumber: Int? = null

    while (userNumber !in 1..10){
        println("Enter number 1 - 10: ")
        val userInput = readLine()
        userNumber = userInput?.toIntOrNull()

        if (userNumber in 1..10){
            println("Valid number entered: $userNumber")
        }else{
            println("Invalid input, try again.")
        }
    }
}