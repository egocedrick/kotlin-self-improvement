fun main() {
    //Partition with Numbers
    val numbers = listOf<Int>(-17, 20, -12, -77, 25, 31, -1)

    val (positive, negative) = numbers.partition { it > 0 }

    println("Positive Number: $positive")
    println("Negative Number: $negative")
}