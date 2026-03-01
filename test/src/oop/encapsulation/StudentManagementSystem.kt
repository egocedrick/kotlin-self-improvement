package oop.encapsulation

// Parent class
class Person(
    private val name: String,
    private var age: Int
){
    // Getters
    fun getAge(): Int {
        return age
    }

    // Setters
    fun setAge(newAge: Int) {
        if (newAge > 0) {
            age = newAge
        } else {
            println("Invalid age")
        }
    }

    fun introduce() {
        println("Hello I'm $name, $age years old")
    }
}

fun main() {
    val person = Person("Cedrick", 25)
    person.introduce()

    person.setAge(18) // Setters
    println("Updated age: ${person.getAge()}")  // Getters
    person.introduce()
}
