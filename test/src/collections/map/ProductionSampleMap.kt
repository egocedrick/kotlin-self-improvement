fun main() {
    //Real-World Example
    val inventory = mapOf(
        "Mango" to 50,
        "Banana" to 10,
        "Apple" to 0,
        "Orange" to 75
    )

    val (inStock1, outOfStock2) = inventory.entries.partition { it.value > 0 }

    println("In Stock: ${inStock1.associate { it.toPair() }}")
    println("Out of Stock: ${outOfStock2.associate { it.toPair() }}")
    println()

// ---------------------- Basic Map Partition -------------------------------------------- //
    val (inStock, outOfStock) = inventory.entries.partition { entry ->
        entry.value > 0
    }

    println("In Stock: $inStock")
    println("Out of Stock: $outOfStock")
    println()

// ------------------------ Convert Back to Map ------------------------------------------- //

    val inStockMap = inStock.associate { it.toPair() }
    val outOfStockMap = outOfStock.associate { it.toPair() }

    println(inStockMap)
    println(outOfStockMap)
    println(inStockMap["Mango"])
    println()

// ------------------------- Partition + MapValues ----------------------------------------- //

    val (high, low) = inventory.entries.partition { it.value > 50 }

    val highMap = high.associate { it.toPair() }.mapValues { it.value + 10 }
    val lowMap = low.associate { it.toPair() }.mapValues { it.value + 5 }

    println(highMap)
    println(lowMap)
    println()

// -------------------------- Partition + Map + Filter ------------------------------------- //

    val (valid, invalid) = inventory.entries
        .filter { it.key.length > 3 }
        .map { it.key to it.value * 2 }
        .partition { it.second > 50 }

    val validMap = valid.associate { it }
    val invalidMap = invalid.associate { it }

    println(validMap)
    println(invalidMap)
}