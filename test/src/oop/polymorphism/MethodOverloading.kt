package oop.polymorphism

class Calculator {
    fun add(a: Int, b: Int) = a + b
    fun add(a: Double, b: Double) = a + b
    fun add(a: Int, b: Int, c: Int) = a + b + c
}

fun main() {
    val calc = Calculator()
    println(calc.add(2,3))  // Int Version
    println(calc.add(2.5, 3.5))     // Double version
    println(calc.add(1, 2, 3))  // 3-parameter version
}