fun main(){
    println("==== RANGE EXPLORER ====")

    println("1. Normal Range (1..10)")
    println("2. Reverse Range (10 downTo 1)")
    println("3. Step Range (1..10 step 2)")
    println("4. Until Range (1 until 10)")
    println("5. Dynamic Range (User Input)")
    println("Choose option: ")

    val chooseOption = readLine()?.toIntOrNull()?:0

    while(chooseOption == 1){
        for (number in 1..10){
            print("$number ")
        }
        break
    }
    while (chooseOption == 2){
        for (number in 10 downTo 1){
            print("$number ")
        }
        break
    }
    while (chooseOption == 3){
        for (number in 1..10 step 2){
            print("$number ")
        }
        break
    }
    while (chooseOption == 4){
        for (number in 1 until 10){
            print("$number ")
        }
        break
    }

    while (chooseOption == 5){
        println("Enter start: ")
        val startRange = readLine()?.toIntOrNull()?:0

        println("Enter end: ")
        val endRange = readLine()?.toIntOrNull()?:0

        println("Enter step: ")
        val stepRange = readLine()?.toIntOrNull()?:0

        for (number in startRange..endRange step stepRange){
            print("$number ")
        }
        break
    }
}