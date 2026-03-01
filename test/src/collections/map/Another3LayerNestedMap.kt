fun main() {
    val delivery = mutableMapOf(
        "Fruits" to mutableMapOf(
            "Tropical" to mutableMapOf(
                "Mango" to 50,
                "Banana" to 100
            ),
            "Citrus" to mutableMapOf(
                "Orange" to 75,
                "Lemon" to 40
            )
        ),

        "Vegetables" to mutableMapOf(
            "Root" to mutableMapOf(
                "Carrot" to 60,
                "Potato" to 120
            ),

            "Leafy" to mutableMapOf(
                "Spinach" to 30,
                "Lettuce" to 25
            )
        )
    )
    val mangoCount = delivery["Fruits"]?.get("Tropical")?.get("Mango")
    println("Mango count: ${mangoCount?: "Invalid Input"}")

    delivery["Fruits"]?.get("Tropical")?.put("Papaya", 20)

    delivery["Vegetables"]?.get("Root")?.put("Onion", 90)

    println()

    for ((categoryName, subCategoryMap) in delivery){
        println("Category: $categoryName")

        for ((subCategoryName, items) in subCategoryMap){
            println("SubCategory: $subCategoryName")

            for ((itemName, count) in items){
                println(" - $itemName = $count")
            }
        }
        println()
    }
}