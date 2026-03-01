data class User(val id: Int, val name: String, val active: Boolean)

fun main() {
    val users = listOf(
        User(1, "John", true),
        User(2, "Mark", false),
        User(3, "Anna", true),
        User(4, "Li", false)
    )

    val (active, inactive) = users
        .filter { it.name.length > 2 }            // FILTER
        .map { it.id to it.active }               // MAP
        .partition { it.second }                  // PARTITION

    val activeMap = active.associate { it }       // ASSOCIATE
    val inactiveMap = inactive.associate { it }

    val totalActive = activeMap.values.count()    // REDUCE (count)
    val totalInactive = inactiveMap.values.count()

    println("Active Users: $activeMap")
    println("Inactive Users: $inactiveMap")
    println("Total Active: $totalActive")
    println("Total Inactive: $totalInactive")
}