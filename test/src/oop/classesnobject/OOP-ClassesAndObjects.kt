// Create a Class about me
class John {
    var height = ""
    var weight = ""
    var looks = ""
}

//Create a Class about my bad traits
class BadTraits{
    var badMouthJarvis = ""
    var selfEsteem = ""
    var lackSelfConfidence = ""
}

fun main() {
    val classSample = John()
    classSample.height = "180 cm"
    classSample.weight = "80kg"
    classSample.looks = "Handsome"

    val classSample1 = BadTraits()
    classSample1.badMouthJarvis = "Palamura especially kay Jarvis"
    classSample1.selfEsteem = "Mahina ang loob"
    classSample1.lackSelfConfidence = "Walang kumpyansa"

    println("Good Trait ni John ang mga sumusunod: ")
    println("Height is: ${classSample.height}")
    println("Weight is: ${classSample.weight}")
    println("Looks is: ${classSample.looks}")
    println()

    println("Bad Trait ni John ang mga sumusunod: ")
    println(classSample1.badMouthJarvis)
    println(classSample1.selfEsteem)
    println(classSample1.lackSelfConfidence)

}