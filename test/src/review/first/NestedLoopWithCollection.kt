package review.first

fun main() {
    val input: List<String> = listOf("red", "blue")
    val number: List<Int> = listOf(1,2)

    for (x in input){
        for (a in number){
            println("Color $x -> Number $a")
        }
    }
}