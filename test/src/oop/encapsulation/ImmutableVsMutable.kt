package oop.encapsulation

// Purpose: Show how encapsulation enforces immutability
// 'val' = read-only, cannot be changed after initialization
// 'var' = mutable, can be updated via setter

class BankAccount (
    private val accountNumber: String,  // immutable (val would also work)
    private var balance: Double         // mutable
) {
    // Getter for balance
    fun getBalance() = balance

    // Setter with validation
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $amount, new balance: $balance")
        } else {
            println("Invalid deposit amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance-= amount
            println("Withdraw: $amount, new balance: $balance")
        }
    }
}

fun main() {
    val account = BankAccount("123456", 1000.0)

    println("Initial balance: ${account.getBalance()}")
    account.deposit(500.0)
    account.withdraw(200.0)

    // account.accountNumber cannot be changed since it's immutable
}