package oop.abstraction

// Abstract class
abstract class PaymentMethod(val accountId: String) {
    abstract fun pay(amount: Double)
    fun showAccount() {
        println("Account ID: $accountId")
    }
}

// Interface
interface Refundable {
    fun refund(amount: Double)
}

// Child class combining abstract + interface
class CreditCardPayment(
    accountId: String,
    private var balance: Double
): PaymentMethod(accountId), Refundable {
    override fun pay(amount: Double) {
        if (amount <= balance){
            balance -= amount
            println("Paying $amount using Credit Card...  Remaining balance: $balance")
        } else {
            println("Insufficient balance!")
        }
    }

    override fun refund(amount: Double) {
        balance += amount
        println("Refunding $amount back to Credit Card... Updated balance: $balance")
    }

    fun getBalance(): Double = balance
}

fun main() {
    val payment: PaymentMethod = CreditCardPayment("1232", 1000.0)
    payment.showAccount()
    payment.pay(500.0)

    val refundable: Refundable = payment as Refundable
    refundable.refund(220.0)

    val card = payment as CreditCardPayment
    println("Final balance: ${card.getBalance()}")

}
