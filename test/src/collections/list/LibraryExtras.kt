package collections.list

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    println(numbers.any { it > 3 })  // At least one matches
    println(numbers.all { it > 0 })  // All matches
    println(numbers.fold(10){ acc, n -> acc + n})  // Accumulate with initial values
    numbers.forEach { println("Number: $it") }  // iterate with lambda
}