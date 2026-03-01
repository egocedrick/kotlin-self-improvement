package review.second

fun main() {
    val input: List<Int> = listOf(4,1,9)
    var sum = 0
    var max = input[0]
    var min = input[0]

    for (x in input){
        sum += x
        if (x > sum){
            max = x

        }else if (x < min){
            min = x
        }
    }
    println("Sum: $sum")
    println("Max: $max")
    println("Min: $min")
}
