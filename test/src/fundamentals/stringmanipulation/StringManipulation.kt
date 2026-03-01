package fundamentals.stringmanipulation

fun main() {
    val text = "  Hello Kotlin World  "
    println(text.trim()) // Remove spaces
    println(text.substring(2, 7))  // Get the part of string
    println(text.replace("World", "Fans"))  // Change the characters or words
    println(text.split(" "))  // Spit string into List
    println(text.lowercase())  // Text formatting
    println(text.uppercase())  // Text formatting
}