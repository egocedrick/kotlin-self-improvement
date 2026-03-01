package oop.inheritance

// Parent Class

open class Person(
    val name: String,
    val age: Int
) {
    fun introduce(){
        println("Hi, I'm $name and I'm $age years old.")
    }
}

// Child class Student
class Student(
    name: String,
    age: Int,
    val grade: Float
): Person(name, age) {          // Call the parent constructor
    fun study(){
        println("$name is studying with grade $grade")
        println()
    }
}

// Child class Employee
class Employee(
    name: String,
    age: Int,
    val position: String
): Person(name, age){            // Call the parent constructor
    fun work(){
        println("$name is working as a $position")
    }
}

fun main() {
    val student = Student("Ced", 25, 90.10F)
    student.introduce()
    student.study()

    val employee = Employee("John", 25, "IT")
    employee.introduce()
    employee.work()
}