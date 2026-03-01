package review.first

fun main() {
    val input: List<Int> = listOf(100,25,300,5,75)
    var min = input[0]

    for (x in input){
        if (x < min){
            min = x
        }
    }
    println("Min number: $min")
}