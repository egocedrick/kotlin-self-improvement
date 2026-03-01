package fundamentals.file

import java.io.File

fun main() {
    val file = File("sample.txt")
    file.writeText("Hello, Kotlin File I/O!")

    val content = file.readText()
    println("File content: $content")
}