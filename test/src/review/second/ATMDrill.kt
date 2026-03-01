package review.second

fun main() {

    var balance = 0.0

    while (true){
        print("Enter command: ")
        val command: String? = readLine()

        when(command){
            "deposit" -> {
                print("Enter amount: ")
                val amount = readLine()?.toDoubleOrNull()?:0.0
                balance += amount
                println("Command deposit: $amount -> Balance: $balance")
            }

            "withdraw" -> {
                print("Enter withdraw amount: ")
                val withdrawAmount = readLine()?.toDoubleOrNull()?:0.0
                if (withdrawAmount <= balance){
                    balance -= withdrawAmount
                    println("Command withdraw: $withdrawAmount -> Balance: $balance")
                } else {
                    println("Insufficient amount!")
                }


            }

            "balance" -> {
                println("Balance: $balance")
            }

            "exit" -> {
                println("Prompt ended")
                break
            }
            else -> println("Unknown Command")
        }
    }
}