package oop.polymorphism

open class PersonPoly(
    val name: String,
    val age: Int
) {
    open fun introduce() {
        println("Hello I'm $name, $age years old.")
    }
}

class StudentPoly(
    name: String,
    age: Int,
    private val studentId: Int,
    private var course: String
    ): PersonPoly(name,age) {


    // Method overriding
    override fun introduce() {
        println("Hello I'm $name, $age years old: $studentId enrolled as $course ")
    }

    // Method overloading
    fun setCourse(newCourse: String) {
        if (newCourse.isNotBlank()) {
            course = newCourse
            println("Course updated to: $newCourse")
        } else {
            println("Invalid course")
        }
    }

    fun setCourse(newCourse: String, yearLevel: Int) {
        course = newCourse
        println("Course update to $newCourse for year $yearLevel")
    }
}

fun main() {
    val studentPoly = StudentPoly("Ced", 25, 1232, "BS-IT")
    studentPoly.introduce()
    studentPoly.setCourse("BS-CS")

    studentPoly.setCourse("BS-CS", 2)
}

