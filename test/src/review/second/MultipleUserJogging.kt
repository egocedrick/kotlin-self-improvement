package review.second

fun main() {
    val users = listOf(
        listOf(3,4,2,5,3,0,4),      // User A
        listOf(2,2,2,2,2,2,2),      // User B
        listOf(5,0,4,3,0,2,1)       // User C
    )

    for ((index, laps)in users.withIndex()){
        var productName = "${'A' + index}"
        var joggingDays = 0
        var totalDays = 0.00
        var skipDays = false

        for (x in laps){
            if (x > 0){
                joggingDays++
                totalDays += x
            }

            if (x == 0){
                skipDays = true
            }
        }
        val average = totalDays / joggingDays
        println("User $productName Days: $joggingDays, Average: ${String.format("%.2f",average)}, Skip Day: $skipDays")
    }

}