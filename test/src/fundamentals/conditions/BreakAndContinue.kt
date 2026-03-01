fun main(){
    var number = 1

    while (number <= 10) {
        if (number == 5) {
            number++
            continue
        }else if (number == 8) {
            break
        }
        println(number)
        number++
    }
}