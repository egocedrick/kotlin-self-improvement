fun main() {
    val inventory = mapOf(
        "Mango" to 50,
        "Banana" to 10,
        "Apple" to 0,
        "Orange" to 75,
        "Kiwi" to 5
    )

    // ------------- 1. FILTER — remove items with short names ------------------------------ //
    val filtered = inventory.entries.filter { it.key.length > 3 }

    // ------------- 2. MAP — double the stock values --------------------------------------- //
    val mapped = filtered.map { it.key to it.value * 2 }

    // ------------- 3. PARTITION — separate high vs low stock ------------------------------ //
    val (high, low) = mapped.partition { it.second > 50 }

    // ------------- 4. ASSOCIATE — convert lists back to Maps ------------------------------ //
    val highMap = high.associate { it }
    val lowMap = low.associate { it }

    println("High Stock: $highMap")
    println("Low Stock: $lowMap")
    println()

    // -------------- 5. REDUCE — compute total stock --------------------------------------- //
    val totalHigh = highMap.values.reduce { acc, value -> acc + value }
    val totalLow = lowMap.values.reduce { acc, value -> acc + value }

    println("Total High Stock: $totalHigh")
    println("Total Low Stock: $totalLow")
    println()

    // ---------------- Full Pipeline in One Chan -------------------------------------------- //

    val (high1, low1) = inventory.entries
        .filter { it.key.length > 3 }          // FILTER
        .map { it.key to it.value * 2 }        // MAP
        .partition { it.second > 50 }          // PARTITION

    val highMap1 = high1.associate { it }        // ASSOCIATE
    val lowMap1 = low1.associate { it }

    val totalHigh1 = highMap.values.reduce { acc, v -> acc + v }   // REDUCE
    val totalLow1 = lowMap.values.reduce { acc, v -> acc + v }

    println("High: $highMap1")
    println("Low: $lowMap1")
    println()
    println("Total High: $totalHigh1")
    println("Total Low: $totalLow1")

}