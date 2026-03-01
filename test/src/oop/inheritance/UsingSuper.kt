package oop.inheritance

// Call parents method/constructor
// Useful when overriding but still want parent behavior

open class Person2(val name: String) {
    open fun introduce() {
        println("Hi, I'm $name")
    }
}

class Student2(name: String, val grade: Int): Person2(name) {
    override fun introduce() {

        // Call parent method first
        super.introduce()
        println("My grade is $grade")
    }
}

fun main() {
    val student = Student2("Cedrick", 99)
    student.introduce()
}