fun main(){
    val samples = arrayOf(2,4,6,7,8,10)
    print("====Even Collector====")

    for (x in samples){
        if (x % 2 != 0){
            break //stop at first odd number//
        }else{
            println(x)
        }
    }
}