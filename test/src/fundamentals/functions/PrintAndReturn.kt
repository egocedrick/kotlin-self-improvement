fun squareWithPrint(x: Int) {
    println(x * x)   // prints result, but does not return it
}

fun squareWithReturn(x: Int): Int {
    return x * x     // returns result to caller
}

fun main() {
    squareWithPrint(5)              // console shows "25"
    val result = squareWithReturn(5)
    println("Returned value: $result") // console shows "Returned value: 25"
}