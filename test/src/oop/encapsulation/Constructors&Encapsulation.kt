class Car(
    private var brand: String,
    private var variant: String,
    private val year: Int) {

    // --------------- Add Methods ---------------------------------------------- //
    fun fullInfo(): String{
        return "$brand $variant ($year)"
    }

    // ---------------- Secondary Constructor ----------------------------------- //
    constructor(brand: String) : this(brand, "Unknown", 2000)
    constructor(brand: String, variant: String) : this(brand, variant, 2000)


    // -------------------- init block - automatic run --------------------------- //
    init {
        println("New car created: $brand $variant $year")
    }
    // --------------------- Encapsulation --------------------------------------- //
    fun getBrand() = brand
    fun getVariant() = variant
    fun getYear() = year
    fun setBrand(newBrand: String) {brand = newBrand}
}

// ------------------ Default Values ---------------------------------------------- //

class DefaultValue(
    var branding: String = "Unknown",
    var model: String = "Standard",
    var carColor: String = "Default",
    val yearCar: Int = 2025,
){
    // -------------- Add Methods in Default Value -------------------------------- //
    fun fullInformation(): String{
        return "$branding $model $carColor ($yearCar)"
    }
}

fun main() {
    // ---------------- Basic Primary Constructor --------------------------------- //
    val c1 = Car("Toyota", "Vios", 2025)
    val c2 = Car("Honda", "City", 2024)
    val c3 = Car("Mitsubishi", "Mirage", 2019)

    println()
    println("My first option of car is: ${c1.getBrand()}")
    println("My second option of sedan is: ${c2.getVariant()}")
    println("I'm curious about: ${c3.getBrand()}")
    println()

    // ---------------- Add default values ---------------------------------------- //

    val d1 = DefaultValue()
    val d2 = DefaultValue("Toyota")
    val d3 = DefaultValue("Toyota", "Vios")
    val d4 = DefaultValue("Toyota", "Vios", "Silver Metallic", 2025)

    println("My go to car as of the moment is: ${d4.branding} ${d4.model}")

    // ---------------- Add Methods ----------------------------------------------- //

    println(c1.fullInfo())
    println(d4.fullInformation())
    println()

    // --------------- Encapsulation ---------------------------------------------- //
    c1.setBrand("Ford") // bypasses the setBrand()

    println("Updated first option ko: ${c1.getBrand()}")
    println("Updated info: ${c1.fullInfo()}")

}