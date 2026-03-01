package fundamentals.inputhandling

fun main() {
    println("========Calculator with Condition===========")

    println("Enter first number: ")
    val firstNumber = readLine()?.toDoubleOrNull()?:0.00

    println("Enter operator: ")
    val operator = readLine()

    println("Enter second number: ")
    val secondNumber = readLine()?.toDoubleOrNull()?:0.00

    val addition = firstNumber + secondNumber
    val subtraction = firstNumber - secondNumber
    val multiplication = firstNumber * secondNumber
    val division = firstNumber / secondNumber

    if (operator == "+"){
        println("The sum is: $addition")
    } else if (operator == "-"){
        println("The difference is: $subtraction")
    } else if (operator == "*"){
        println("The product is: $multiplication")
    } else if (secondNumber == 0.0){
        println("Cannot divide by zero")
    } else if (operator == "/"){
        println("The quotient: $division")
    }else{
        println("Invalid operator")
    }
}
