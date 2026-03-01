package oop.inheritance

open class Person3(
    private val name: String,
    private var age: Int

) {
    fun introduce() {
        println("Hello I'm $name, $age years old")
    }
}


    class Student3(
        name: String,
        age: Int,
        val studentId: Int,
        private var course: String
        ): Person3(name, age) {

        fun setCourse(newCourse: String) {
            if (newCourse.isNotBlank()) {
                course = newCourse
            } else {
                println("Invalid Course")
            }
        }
        fun showDetails() {
            println("Student has $studentId in course of $course")
        }
    }

fun main() {
    val student3 = Student3("Ced", 25, 1232, "BS-IT")
    student3.introduce()

    student3.setCourse("BS-CS")
    student3.showDetails()
}