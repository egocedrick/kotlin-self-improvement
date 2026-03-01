// Superclass or Parent
open class Animal{
    fun eat (){
        println("Eating....")
    }

}

// Subclass or Child
class Dog: Animal(){
    fun bark(){
        println("Woof!")
    }
}

// Subclass or Child
class Cat: Animal(){
    fun meow(){
        println("Meow!")
    }
}

fun main() {
    val domesticated = Cat()
    domesticated.meow()

    println("\n....")

    val protection = Dog()
    protection.bark()

    println("\n....")

    val together = Animal()
    together.eat()
}