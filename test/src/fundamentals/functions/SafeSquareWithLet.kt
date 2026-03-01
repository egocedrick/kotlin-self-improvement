fun safeSquare(x: Int): Int?{
    return if (x >= 0){
        x*x
    } else {
        null
    }
}

fun main(){
    val result = safeSquare(4)
    println("Square value: $result")

    result?.let { value ->
        println("Square + 10: ${result?.plus(10)}")
        println("Square - 2: ${result?.minus(2)}")
        println("Square / 2: ${(result?.toDouble())?.div(2)}")
    }

    val resultNull = safeSquare(-3)
    println("Invalid input, ${resultNull?:"cannot compute square"}")
}