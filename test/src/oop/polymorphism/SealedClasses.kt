package oop.polymorphism

sealed class Result {
    class Success(val data: String): Result()
    class Error(val message: String): Result()
    object Loading: Result()
}

fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> println("Success with data: ${result.data}")
        is Result.Error -> println("Error occurred: ${result.message}")
        Result.Loading -> println("Loading...")
    }
}

fun main() {
    val success = Result.Success("Data Loaded")
    val error = Result.Error("Network Failure")
    val loading = Result.Loading

    handleResult(success)
    handleResult(error)
    handleResult(loading)
}