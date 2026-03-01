package review

fun main() {
    val input: List<Int> = listOf(1,2,3,4,5,6)

    for (x in input){
        if (x % 2 == 0){
            println(x)
        }
    }
}