package oop.abstraction

// Sealed class with generics
sealed class Result<out T> {
    data class Success<T>(val data: T): Result<T>()
    data class Error(val message: String): Result<Nothing>()
}

// Abstract repository with generics

abstract class Repository<T>{
    abstract fun fetchData() : Result<T>
}

// Example implementation: UserRepository
data class User(val username: String, val email: String)

class UserRepository : Repository<User>() {
    override fun fetchData(): Result<User> {
        // Simulate success
        val user = User("john_cedrick", "asadcedrick012@gmail.com")
        return Result.Success(user)
    }
}

data class Product(val name: String, val price: Double)

class ProductRepository : Repository<Product>() {
    override fun fetchData(): Result<Product> {
        // Simulate Error
        return Result.Error("Failed to fetch product data")
    }
}

// Usage
fun main() {
    val userRepo = UserRepository()
    val productRepo = ProductRepository()

    val userResult = userRepo.fetchData()
    val productResult = productRepo.fetchData()

    // Exhaustive handling
    when(userResult) {
        is Result.Success -> println("User fetched: ${userResult.data}")
        is Result.Error -> println("Error: ${userResult.message}")
    }

    when(productResult) {
        is Result.Success<*> -> println("Product fetched: ${productResult.data}")
        is Result.Error -> println("Error: ${productResult.message}")
    }
}