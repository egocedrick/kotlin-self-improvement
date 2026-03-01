package oop.inheritance

// Chain of classes
// Grandchild inherits all behaviors from Parent + Child

// Parent Class
open class Animal {
    fun eat() {
        println("Animal is eating....")
    }
}

// Child Class
open class Dog: Animal() {
    fun bark() {
        println("Dog is barking...")
    }
}

// Grandchild Class
class Puppy: Dog() {
    fun play() {
        println("Puppy is playing...")
    }
}

fun main() {
    val puppy = Puppy()
    puppy.eat()   // Inherited from Animal
    puppy.bark()  // Inherited from Dog
    puppy.play()  // Puppy's own method
}