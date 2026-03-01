package oop.polymorphism

// Parent class
open class Animals() {
    open fun sounds() {
        println("Generic Sound")
    }
}

// Child class
class Dogs: Animals() {
    override fun sounds() {
        println("Woof!")
    }
}

class Cats: Animals() {
    override fun sounds() {
        println("Meow!")
    }
}

fun main() {
    val animal1: Animals = Dogs()
    animal1.sounds()

    val animal2: Animals = Cats()
    animal2.sounds()

    val animal3: Animals = Animals()
    animal3.sounds()
}