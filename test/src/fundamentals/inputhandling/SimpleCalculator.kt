package fundamentals.inputhandling

fun main(){
    println("Enter your first number: ")
    val firstNumber = readLine()?.toIntOrNull()?:0

    println("Enter your second number: ")
    val secondNumber = readLine()?.toIntOrNull()?:0

    println("Sum is: ${firstNumber + secondNumber}")
    println("Difference is: ${firstNumber - secondNumber}")
    println("Product is: ${firstNumber * secondNumber}")
    if (secondNumber != 0){
        println("Quotient is: ${firstNumber / secondNumber}")
        println("Remainder is: ${firstNumber % secondNumber}")
    }else{
        println("Division by remainder by zero are not allowed")
    }
}