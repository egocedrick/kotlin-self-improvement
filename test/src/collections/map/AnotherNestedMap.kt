fun main(){
    val foods = mutableMapOf<String, MutableMap<String, Int>>(
        "Fruits" to mutableMapOf(
            "Apple" to 10,
            "Banana" to 20
        ),
        "Vegetables" to mutableMapOf(
            "Carrot" to 15,
            "Potato" to 25
        )
    )
    val getApple = foods["Fruits"]?.get("Apple")
    println("Apple count: ${getApple?: "Not found!"}")

    foods["Fruits"]?.put("Strawberry", 15)

    for ((categoryName, category) in foods){
        println("Category: $categoryName ")

        for ((key, value) in category){
            println(" - $key = $value")
        }
        println("Total items in $categoryName = ${category.count()}")
        println()
    }

}