package oop.inheritance

// Parent Class
open class Person1(
    val name: String,
    val age: Int
) {

    // open allows the child to override the method
    open fun introduce() {
        println("Hi I'm $name and I'm $age years old!")
    }
}


class Student1(
    name: String,
    age: Int,
    val grades: Float
): Person1(name, age) {

    // override modifies the parent introduce() behavior
    override fun introduce(){
        println("Hi I'm $name, $age years old, and my grade is $grades")
    }
    fun study(){
        println("$name is studying hard.")
    }
}

class Employee1(
    name: String,
    age: Int,
    val position: String
): Person1(name, age) {
    override fun introduce() {
        println("HI I'm $name, $age years old, working as $position")
    }
    fun work() {
        println("$name is busy working")
    }
}

fun main() {
    val student = Student1("Cedrick",25, 90.5F)
    student.introduce()
    student.study()

    println("--------------------")

    val employee = Employee1("John", 25, "Mobile Developer")
    employee.introduce()
    employee.work()
}