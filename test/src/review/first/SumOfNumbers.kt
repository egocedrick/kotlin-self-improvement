package review.first

fun main() {
    val numbers: MutableList<Int> = mutableListOf(2,4,6,8)
    var sum = 0

    for (x in numbers){
        sum += x
    }
    println("Total sum: $sum")
}
