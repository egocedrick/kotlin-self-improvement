package oop.abstraction

// Abstract Class with Polymorphism
abstract class Gadget{
    abstract val modelName: String
    abstract val powerSource: String

    fun showDetails() {
        println("Model: $modelName, Power: $powerSource")
    }
}

// Child classes implement abstract properties
class Laptop(
    override val modelName: String,
    override val powerSource: String
): Gadget() {
    fun code() {
        println("$modelName laptop is running on $powerSource is coding...")
    }
}

class Tablet(
    override val modelName: String,
    override val powerSource: String): Gadget() {
    fun browse() {
        println("$modelName tablet is powered by $powerSource is browsing...")
    }
}

fun main() {
    // Polymorphic list of Gadgets
    val gadget: List<Gadget> = listOf(
        Laptop("Lenovo LOQ", "Battery"),
        Tablet("iPAD Air", "Battery"),
        Laptop("Thinkpad X1 Carbon", "Dual Battery")
    )

    // Loop through list and call abstract '+' concrete methods
    for (g in gadget) {
        g.showDetails()
        when(g) {
            is Laptop -> g.code()
            is Tablet -> g.browse()
        }
        println("----------")
    }
}