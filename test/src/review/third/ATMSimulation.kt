package review.third

fun main() {
    var balance = 2000

    var deposit: Int
    var withdraw: Int

    val pin = 1234
    var pinCode: Int

    var attempts = 0
    var input: Int

    do {
        print("Enter pin: ")
        pinCode = readLine()?.toIntOrNull()?:0
        attempts++

        if (pinCode == pin){
            do {
                println("\nATM Simulation")
                println("1. View balance")
                println("2. Deposit balance")
                println("3. Withdraw balance")
                println("4. Exit")
                print("Choose one: ")
                input = readLine()?.toIntOrNull()?:0

                when(input){
                    1 -> {
                        println("Your balance: $balance")
                    }

                    2 -> {
                        print("Deposit money: ")
                        deposit = readLine()?.toIntOrNull()?:0
                        balance += deposit
                        println("Your balance with deposited money: $balance")
                    }

                    3 -> {
                        print("Withdraw money: ")
                        withdraw = readLine()?.toIntOrNull()?:0
                        balance -= withdraw
                        println("Your balance with withdrew money: $balance")
                    }

                    4 -> {
                        println("Exiting program!")
                        break
                    }
                    else -> println("Invalid input!")
                }
            }
                while (input != 4)
        }else if (pinCode == pin){
            println("Login Successful!")
        }else if (attempts == 3){
            println("Account Locked!")
            break
        }else{
            println("Wrong pin!")
        }
    }
        while (pinCode != pin)
}