package review.second

fun main() {
    val jogging = listOf<Int>(3,4,2,5,3,0,4)

    var joggingDays = 0
    var totalDays = 0.0
    var skipDays  = false

    for (x in jogging){
        if (x > 0){
            joggingDays++
            totalDays += x

        }

        if (x == 0){
            skipDays = true
        }

    }
    val average = totalDays / joggingDays

    println("Jogging Days: $joggingDays")
    println("Average Days: $average")
    println("Skip Days: $skipDays")
}