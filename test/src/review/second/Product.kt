package review.second

fun main() {
    val product = listOf(
        listOf(40, 55, 60),     // Product A
        listOf(30, 20, 25),     // Product B
        listOf(70, 80, 65)      // Product C
    )

    for ((index, sales) in product.withIndex()) {
        val productName = 'A' + index
        var totalSales = 0
        var highWeeklySales = sales[0]
        var lowWeeklySales = sales[0]
        var countWeeksExceed = 0

        for (x in sales){
            totalSales += x
            if (x > highWeeklySales) highWeeklySales = x
            if (x < lowWeeklySales) lowWeeklySales = x
            if (x >= 50) countWeeksExceed++
        }
        println("Product ${productName}: Total Sales: $totalSales, Highest Weekly Sales: $highWeeklySales, Lowest Weekly Sales: $lowWeeklySales, Items exceeds per weeks: $countWeeksExceed")
    }
}