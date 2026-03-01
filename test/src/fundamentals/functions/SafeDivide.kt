fun safeDivide(a: Int, b: Int): Int?{
    return if (b == 0){
        null
    } else {
        a / b
    }
}

fun main(){
    val firstResult = safeDivide(10, 2)
    println("Safe divide: $firstResult")

    val secondResult = safeDivide(10, 0)
    println("Safe divide: ${secondResult?: "Division by zero is not allowed" }")

    val product = firstResult?.times(2)
    println("First result value doubled: $product")
}