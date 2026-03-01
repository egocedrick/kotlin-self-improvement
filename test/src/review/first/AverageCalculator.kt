package review

fun main() {
    val input: List<Int> = listOf(2,4,6,8,10)
    var sum = 0

    for (x in input){
        sum += x
    }
    val ave = sum.toDouble() / input.size
    println("Average: $ave")
}