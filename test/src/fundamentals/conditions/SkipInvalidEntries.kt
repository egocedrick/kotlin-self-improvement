fun main(){
    val samples = arrayOf(10,-5,20,0,30)
    println("====Skip Invalid Entries====")

    //print only positive numbers//
    for (x in samples){
        if (x > 0) {
            println(x)
        }
    }
}