package review.third

fun main() {
    var balance = 0
    var choice: Int
    do {
        println("\nBank Menu")
        println("1 - View Balance")
        println("2 - Deposit")
        println("3 - Withdraw")
        println("4 - Exit")

        print("Enter choice: ")
        choice = readLine()?.toIntOrNull() ?: -1

        when (choice) {
            1 -> {
                println("Current balance: $balance")
            }
            2 -> {
                print("Enter deposit amount: ")
                val deposit = readLine()?.toIntOrNull() ?: 0
                if (deposit > 0) {
                    balance += deposit
                    println("Deposited $deposit. New balance: $balance")
                } else println("Invalid deposit amount.")
            }
            3 -> {
                print("Enter withdrawal amount: ")
                val withdraw = readLine()?.toIntOrNull() ?: 0
                if (withdraw in 1..balance) {
                    balance -= withdraw
                    println("Withdrawn $withdraw. Remaining balance: $balance")
                }else{
                    println("Invalid withdrawal amount or insufficient funds.")
                }
            }
            4 -> {
                println("Exiting menu. Goodbye!")
            }
            else -> println("Invalid choice, please try again.")
        }
    } while (choice != 4)
}