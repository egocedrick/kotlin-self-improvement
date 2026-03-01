fun main(){
    val sampleReports = mutableMapOf<Int, String>(1 to "Sales Report", 2 to "Inventory Report", 3 to "Audit Report")
    println("Initial Report: $sampleReports")

    sampleReports[2] = "Updated Inventory"
    sampleReports.remove(1)
    println("Final Reports: $sampleReports")

    val statusReports = mutableMapOf<String, String>("Sales" to "Enabled", "Inventory" to "Disabled", "Audit" to "Pending")

    statusReports["Inventory"] = "Enabled"
    statusReports.remove("Audit")

    for ((report, status) in statusReports){
        println("$report -> $status")
    }
}