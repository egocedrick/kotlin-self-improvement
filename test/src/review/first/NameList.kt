package review.first

fun main() {
    val names: MutableList<String> = mutableListOf("Ana", "Ben", "Carl")

    for (x in names.indices){
        println("Name: $x: ${names[x]}")
    }
}