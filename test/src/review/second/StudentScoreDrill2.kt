package review.second

fun main() {
    val students = listOf(
        listOf(85,92,76),   // 253
        listOf(88,95,70),   // 253
        listOf(90,60,80)    // 230

    )

    for ((index, grades) in students.withIndex()) {
        var studentTotal = 0
        var highScore = grades[0]
        var lowScore = grades[0]
        var countPassed = 0

        for (grade in grades) {
            studentTotal += grade
            if (grade > highScore) highScore = grade
            if (grade < lowScore) lowScore = grade
            if (grade >= 75) countPassed++
        }
        println("Student ${index + 1} -> Total: $studentTotal, High: $highScore, Low: $lowScore, Passed: $countPassed")

    }
}