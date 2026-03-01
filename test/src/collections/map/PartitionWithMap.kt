fun main() {

    //Partition with Map
    val busName = listOf("Starliner1", "Jac Liner2", "Dela Rosa3", "Kersteen")

    val (withNumbers, withoutNumbers) = busName.partition { it.any { ch -> ch.isDigit() } }

    val upperWithNumbers = withNumbers.map { it.uppercase() }

    println("Uppercase with numbers: $upperWithNumbers")
    println("Without numbers: $withoutNumbers")
}