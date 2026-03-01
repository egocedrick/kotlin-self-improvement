package oop.polymorphism

// Parent class
abstract class Shape {
    abstract fun draw()
}

// Child classes
class Circle: Shape() {
    override fun draw() = println("Drawing Circle")
}

class Rectangle: Shape() {
    override fun draw() = println("Drawing Rectangle")
}


fun main() {
    val shapes: List<Shape> = listOf(Circle(), Rectangle())
    for (s in shapes) s.draw()
}
