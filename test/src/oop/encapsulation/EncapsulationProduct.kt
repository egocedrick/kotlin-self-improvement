class Product(
    private var name: String,
    private var price: Float,
    private var stock: Int
) {
    // Getters
    fun getName() = name
    fun getPrice() = price
    fun getStock() = stock

    // Setters with validation
    fun setName(newName: String) {
        if (newName.isNotBlank()) {
            name = newName
            println("Name updated")
        } else {
            println("Invalid name")
        }
    }

    fun setPrice(newPrice: Float) {
        if (newPrice > 0) {
            price = newPrice
            println("Price updated")
        } else {
            println("Invalid price")
        }
    }

    fun setStock(newStock: Int) {
        if (newStock >= 0) {
            stock = newStock
            println("Stock updated")
        } else {
            println("Invalid stock")
        }
    }

    // Custom toString for cleaner output
    override fun toString(): String {
        return "Product(name=$name, price=$price, stock=$stock)"
    }

}

fun main() {
    val product = Product("Laptop", 50000.0F, 10)

    // Initial info
    println(product)
    println()

    // Invalid updates
    product.setPrice(-1000.0F)
    product.setStock(-5)
    product.setName("")
    println()

    // Valid updates
    product.setPrice(45000.0F)
    product.setStock(8)
    product.setName("Gaming Laptop")
    println()

    // Final info
    println(product)
}