package oop.polymorphism

// Parent
open class Animal {
    open fun sound() = println("Default Sound")
}

// Children - (Inheritance)
class Dog: Animal() {
    override fun sound() = println("Woof!")
}

class Cat: Animal() {
    override fun sound() = println("Meow!")
}

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat())

    // Polymorphism in action
    for (a in animals) a.sound()
}