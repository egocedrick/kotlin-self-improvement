package review

fun main() {
    val input: List<String> = listOf("apple", "kiwi", "banana", "pear")
    var count = 0

    for (x in input){
        if (x.length > 4){
            count++
        }
    }
    println("Count of fruits with length > 4: $count")
}