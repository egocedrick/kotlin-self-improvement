package fundamentals.functions

fun operationOnNumbers(a: Int, b: Int, operation: (Int, Int)-> Int): Int{
    return operation(a,b)
}

fun main() {
    val sum = operationOnNumbers(5,3) {x,y -> x + y}
    val product = operationOnNumbers(5,3) {x,y -> x * y}

    println("Sum: $sum")
    println("Product: $product")
}