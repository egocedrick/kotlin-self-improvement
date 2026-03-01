fun safePositive(x: Int): Int?{
    return if (x >= 0){
        x
    } else {
        null
    }
}

fun main(){

    val result = safePositive(2)
    println("Safe Value: $result")

    val resultNull = safePositive(-5)
    println("Safe value: ${resultNull?:"Invalid Input"}")

    val resultAdd = result?.plus(2)
    println("Addition result: $resultAdd")

    val resultDiff = result?.minus(2)
    println("Subtraction result: $resultDiff")

    val resultProd = result?.times(2)
    println("Multiplication result: $resultProd")

    val resultQuo = result?.div(2)
    println("Division result: ${resultQuo?.toDouble()}")
}