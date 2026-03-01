fun main(){
    val reportName = mutableMapOf<String, MutableMap<String, String>>(
        "Sales" to mutableMapOf(
            "Status" to "Enabled",
            "Owner" to "John",
            "Date" to "Nov 21"
        ),
        "Inventory" to mutableMapOf(
            "Status" to "Disabled",
            "Owner" to "Maria"
        )
    )
    // Update a detail
    reportName["Inventory"]?.set("Status", "Enabled")

    // Delete a detail
    reportName["Sales"]?.remove("Date")

    // Loop outer → inner
    for ((reportName, details) in reportName) {
        println("$reportName Report:")
        for ((key, value) in details) {
            println("$key → $value")
       }
        println() // line break for readability
    }
}