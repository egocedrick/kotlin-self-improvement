package review.first

fun main() {
    val sumOdd: List<Int> = listOf(1,2,3,4,5,6,7)
    var odd = 0

    for (x in sumOdd){
        if (x % 2 != 0){
            odd += x
        }
    }
    println("Sum of odd numbers: $odd")
}