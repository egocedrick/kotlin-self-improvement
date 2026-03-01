fun main(){
    val busNames = setOf<String>("Starliner", "Jac Liner", "Dela Rosa", "Kersteen", "Don Aldrin", "Don Aldrin")
    val anotherBus = setOf<String>("ErJohn", "Starliner", "Kersteen", "COOP")
    println(busNames)

    //Partition for Set
    val check = busNames.contains("Jac Liner")
    println("Check Jac Liner: $check")
    println()

    val (longNames, shortNames) = busNames.partition { name -> name.length > 8
    }

    println("Long Names: $longNames")
    println("Short Names: $shortNames")
    println()

    for (name in busNames){
        println("$name ")
    }

    val busNamesUpdated = busNames.toMutableSet()
    busNamesUpdated.add("Barney")
    println("Newly added: $busNamesUpdated")

    busNamesUpdated.remove("Don Aldrin")
    println("Update remove: $busNamesUpdated")

    val unionCombine = busNames union anotherBus
    println(unionCombine)

    val intersect = busNames intersect anotherBus
    println(intersect)

    val sub = busNames subtract anotherBus
    println(sub)
}