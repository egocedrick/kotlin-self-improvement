fun main() {
    val buses = mapOf(
        "Starliner" to 50,
        "Jac Liner" to 20,
        "Dela Rosa" to 10
    )

    //Filter by Value
    val filterValue = buses.filter { (key, value) ->
        value > 20
    }
    println(filterValue)

    //Filter by Key
    val filterKey = buses.filter { (key, value) ->
        key.startsWith("J")
    }
    println("Start with J: $filterKey")

    //Filter by Both (Key and Value)
    val filterBoth = buses.filter { (key, value) ->
        key.contains("Liner") && value >= 20
    }
    println(filterBoth)
    println()

// -------------------------------Filter Only and Value Only-------------------------------------------- //

    //FilterKeys - Filter by Key Only
    val filteredKey = buses.filterKeys { key ->
        key.startsWith("J")
    }
    println(filteredKey)

    //FilterKeys - Filter by Value Only
    val filteredValues = buses.filterValues { value ->
        value > 30
    }
    println(filteredValues)
    println()


// --------------------------------- Map Transform Key + Value ------------------------------------------- //
    // map for Map - Upper Keys
    val upperKeys = buses.map { (key, value) ->
        key.uppercase() to value
    }
    println(upperKeys)

    // Multiply Values
    val doubled = buses.map { (key, value) ->
        key to value * 2
    }
    println(doubled)
    println()

    /* If you want to turn into Map
    val doubledMap = doubled.toMap()

     */

// ------------------------------------------ Transform Values Only --------------------------------------- //
    // mapValues Values Only
    val updatedValue = buses.mapValues { (key, value) ->
        value + 10
    }
    println(updatedValue)
    println()

// ------------------------------------------- Transform Keys Onl ------------------------------------------ //

    val updatedKeys = buses.mapKeys { (key, value) ->
        key.uppercase()
    }
    println(updatedKeys)
    println()

// -------------------------------------------- Advanced Filtering ------------------------------------------ //
    // entries + partition
    val (high, low) = buses.entries.partition { entry ->
        entry.value > 20
    }

    println("High: $high")
    println("Low: $low")
    println()

    /* Alternative for Map
    val highMap = high.associate { it.toPair() }
    val lowMap = low.associate { it.toPair() }
    */

// ---------------------------------------- Partition by Complex Condition ------------------------------------ //

    val (priority, normal) = buses.entries.partition { entry ->
        entry.key.contains("liner") && entry.value > 20
    }

    println(priority)
    println(normal)
    println()

}