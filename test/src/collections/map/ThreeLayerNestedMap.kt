fun main() {
    val inventory = mutableMapOf(
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
            "Roots" to mutableMapOf(
                "Carrot" to 60,
                "Potato" to 120
            ),
            "Leafy" to mutableMapOf(
                "Spinach" to 30,
                "Lettuce" to 25
            )
        )
    )
    val mangoCount = inventory["Fruits"]?.get("Tropical")?.get("Mango")
    println("Mango count: ${mangoCount?: "Not found"}")

    println()

    for ((categoryName, subCategoryMap) in inventory){
        println("Category: $categoryName")

        for ((subCategoryName, items) in subCategoryMap){
            println("Subcategory: $subCategoryName")

            for ((itemName, count) in items){
                println(" - $itemName = $count")
            }
        }
        println()
    }
}