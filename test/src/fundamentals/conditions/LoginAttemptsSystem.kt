fun main(){
    println("====Login Attempt System====")
    var attempts =  0
    val password = "gwapoko"

    while (attempts < 3){
        println("Enter your password: ")
        val inputPass = readLine()

        if (inputPass == password){
            println("Access granted")
            break
        }else{
            attempts++
            println("Attempt $attempts: Invalid input!")
        }
    }
    if (attempts == 3){
        println("Access denied, Attempts exceeded.")
    }
}