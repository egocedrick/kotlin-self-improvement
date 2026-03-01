package review

fun main() {
    val fruits: List<String> = listOf("apple", "kiwi", "banana")

    for (x in fruits){
        if (x == "kiwi"){
            println("kiwi -> skipped")
        }else{
            println("$x -> length ${x.length}")
        }
    }
}