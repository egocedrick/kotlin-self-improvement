fun start(): Int{
    print("Enter start: ")
    return readLine()?.toIntOrNull()?:0
}

fun end(): Int{
    print("Enter end: ")
    return readLine()?.toIntOrNull()?:0
}

fun step(): Int{
    print("Enter step: ")
    return readLine()?.toIntOrNull()?:0
}

fun main(){
    val startInput = start()
    val endInput = end()
    val stepInput = step()

    if (startInput <= endInput){
        for (number in startInput .. endInput step stepInput)
            print("$number ")
    }else{
        for (number in startInput downTo endInput step stepInput)
            print("$number ")
    }
}