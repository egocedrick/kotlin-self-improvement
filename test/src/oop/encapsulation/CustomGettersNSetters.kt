package oop.encapsulation

// Purpose: Show custom getter logic (computed property)

class Product(
    private var name: String,
    private var price: Double
) {

    // Custom getter: discounted price (10% off)
    val discountedPrice: Double
        get() = price * 0.9    // computed properly

    // Getter for original price
    fun getPrice() = price

    // Setter with Validation
    fun setPrice(newPrice: Double) {
        if (newPrice > 0) {
            price = newPrice
            println("Price updated to $price")
        } else {
            println("Invalid price")
        }
    }

    fun getName() = name
}

fun main() {
    val product = Product("Laptop", 50000.0)

    println("Original price: ${product.getPrice()}")
    product.setPrice(45000.0)
    println("Discounted price: ${product.discountedPrice}")
}