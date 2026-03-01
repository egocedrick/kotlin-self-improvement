package review

fun main() {
    val finder: List<Int> = listOf(12,45,7,30)
    var max = finder[0]

    for (x in finder){
        if (x > max){
            max = x
        }
    }
    println("Max number: $max")
}
