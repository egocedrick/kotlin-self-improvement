class Student(
    private var name: String,
    private var grade: Int) {

    fun getName(): String {
        return name
    }

    fun setGrade(newGrade: Int) {
        if (newGrade in 0..100) {
            grade = newGrade
        } else {
            println("Invalid grade: must be between 0 and 100")
        }
    }

    fun isPassing(): Boolean {
        return grade >= 75
    }
}

fun main() {
    val student = Student("John", 80)

    println(student.getName())       // Output: John
    println(student.isPassing())     // Output: true

    student.setGrade(50)
    println(student.isPassing())     // Output: false

    student.setGrade(120)            // Output: Invalid grade
}