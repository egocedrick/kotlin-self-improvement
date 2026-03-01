fun main(){
    val busName: List<String> = listOf("Starliner1", "Jac Liner2", "Dela Rosa3", "HM Transport4", "Kersteen")
    println("These are the 5 buses $busName")
    println("First bus is ${busName.first()}")
    println("Last bus is ${busName.last()}")
    println()

    //Partition with Multiple Conditions (Nested Logic)
    val (withDigit, noDigit) = busName.partition { name -> name.any{it.isDigit()}
    }

    println("With Digit: $withDigit")
    println("No Digit: $noDigit")
    println()

    //Partition for List
    val (withNumbers, withoutNumbers) = busName.partition { bus -> bus.any { it.isDigit() }
    }

    println("With Numbers: $withNumbers")
    println("Without Numbers: $withoutNumbers")
    println()

    //Partition with Complex Conditions
    val (startsWithJ, others) = busName.partition { it.startsWith("J") }

    println("Start with J: $startsWithJ")
    println("Others: $others")
    println()

    for (name in busName){
        println(name)
    }

    val filter2 = busName.filter { it.contains("2") }
    println("The number 2 is $filter2")

    val mapUppercase = busName.map { it.uppercase() }
    println("Bus Name Uppercase: $mapUppercase")

    val busNameUpdate = busName.toMutableList()
    busNameUpdate.add("Don Aldrin")
    println("$busNameUpdate")

    busNameUpdate.remove("HM Transport4")
    println("$busNameUpdate")
}
