package review.first

fun main() {
    val input: List<Int> = listOf(-10,-3,-25,-7)
    var min = input[0]

    for (x in input){
        if (x > min){
            min = x
        }
    }
    println("Max number: $min")
}
