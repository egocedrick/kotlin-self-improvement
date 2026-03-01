fun main() {
    val carBrand = mapOf(
        "Toyota" to 30,
        "Honda" to 20,
        "Jeep" to 50,
        "Mazda" to 70
    )
    // -------------- Filter to Print ----------------------------- //
    val filteredValue = carBrand.filter { (key, value) ->
        value >= 30
    }
    println(filteredValue)

    val filteredKey = carBrand.filter { (key, value) ->
        key.length > 4
    }
    println(filteredKey)
    println()

// ------------------- Filter to Map to Print --------------------- //

    val lowerCase = carBrand.map { (key, value) ->
        key.lowercase() to value
    }
    println(lowerCase)

    val lowerValue = carBrand.map { (key, value) ->
        key to value - 5
    }
    println(lowerValue)
    println()

// ------------------- Filter to Map to Partition to Print --------- //

    val (high, low) = carBrand.entries.partition { demand ->
        demand.value > 30
    }
    println("High Demand: $high")
    println("Low Demand: $low")
    println()

// ------------------- Filter to Map to Partition to Associate to Print ------ //

    val (valid, invalid) = carBrand.entries
        .filter { it.key.length > 4 }
        .map { it.key to it.value * 4 }
        .partition { it.second > 80 }

    val validCar = valid.associate { it }
    val invalidCar = invalid.associate { it }


    println(valid)
    println(invalid)
    println()


// -------------------- Full Pipeline + Reduce ------------------------------- //

    val totalValid = validCar.values.reduce { acc, i -> acc + i}
    val totalInvalid = invalidCar.values.reduce { acc, i -> acc + i}

    println("Total value of Valid: $totalValid")
    println("Total value of Invalid: $totalInvalid")

}
