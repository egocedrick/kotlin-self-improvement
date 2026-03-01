package fundamentals.inputhandling

fun main(){
    println("Enter your Grade in English")
    val gradeEnglish = readLine()?.toDoubleOrNull()?:0.0

    println("Enter your Grade in Science")
    val gradeScience = readLine()?.toDoubleOrNull()?:0.0

    println("Enter your Grade in Math")
    val gradeMath = readLine()?.toDoubleOrNull()?:0.0

    val total = gradeMath + gradeEnglish + gradeScience
    val average = total / 3
    println("Your total average is: ${String.format("%.2f", average)}")
}