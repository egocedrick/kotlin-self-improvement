package oop.abstraction

// Abstract Class
abstract class PaymentMethodV2(val accountId: String) {
    abstract fun pay(amount: Double)
    fun showAccount() {
        println("Account ID: $accountId")
    }
}

// Interface
interface RefundableV2 {
    fun refund(amount: Double)
}

// Child class
class CreditCardPaymentV2(
    accountId: String,
    private var balance: Double
): PaymentMethodV2(accountId), RefundableV2 {
    override fun pay(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Credit Card: Paid $amount. Remaining balance: $balance")
        } else {
            println("credit Card: Insufficient Balance: $balance")
        }
    }

    override fun refund(amount: Double) {
        balance += amount
        println("Credit Card: $amount. Updated balance: $balance")
        println()
    }
}

class PaypalMethod(
    accountId: String,
    private var balance: Double
): PaymentMethodV2(accountId), RefundableV2 {
    override fun pay(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("Paypal Paid: $amount, Remaining balance: $balance")
        } else {
            println("Paypal: Insufficient Balance")
        }
    }

    override fun refund(amount: Double) {
        balance += amount
        println("Paypal Pay: $amount. Updated balance: $balance")
        println()
    }
}

class GCashPayment(
    accountId: String,
    private var balance: Double
): PaymentMethodV2(accountId), RefundableV2{
    override fun pay(amount: Double) {
        if (amount <= balance) {
            balance -= amount
            println("GCash Payment: $amount, Remaining balance: $balance")
        } else {
            println("GCash: Insufficient Balance")
        }
    }

    override fun refund(amount: Double) {
        balance += amount
        println("GCash Pay: $amount. Updated balance: $balance")
        println()
    }
}

fun main() {
    val payments: List<PaymentMethodV2> = listOf(
        CreditCardPaymentV2("001", 1000.0),
        PaypalMethod("002", 500.0),
        GCashPayment("003", 800.0))

    for (payment in payments) {
        payment.showAccount()
        payment.pay(300.0)

        val refundable = payment as RefundableV2
        refundable.refund(100.0)
    }
}
