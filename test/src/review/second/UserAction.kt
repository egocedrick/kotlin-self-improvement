package review.second

fun main() {
    val userActions = listOf<String>("login", "logout", "upload", "download", "delete", "share", "unknown")

    print("Enter the actions: ")
    val action: String? = readLine()

    if (action in userActions) {
        val results = when (action) {
            "login" -> "User logged in."
            "logout" -> "User logged out."
            "upload" -> "File uploaded successfully."
            "download" -> "File downloaded successfully."
            "delete" -> "File deleted."
            "share" -> "File shared with others."
            else -> "Unknow action"
        }
        println("Action: $action -> $results")
    }
}