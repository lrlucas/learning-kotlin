fun main(args: Array<String>) {

    // sayMyName()
    // sayMyLastName()
    // sayMyAge()

    showMyInformation("Lucas", "Suarez", 25)

    var result = add(5, 10)
    println(result)

}


fun sayMyName() {
    println("I'm Lucas Suarez")
}
fun sayMyLastName() {
    println("Suarez yeah")
}
fun sayMyAge() {
    println("I have 25 years old")
}

fun showMyInformation(name:String, lastName:String, age:Int) {
    println("My name is $name $lastName and I've $age years old")
}

// Forma abreviada/resumida: parecida a una funcion de flecha
fun add(firstNumber:Int, secondNumber:Int): Int = firstNumber + secondNumber

// Forma completa
fun add2(firstNumber:Int, secondNumber:Int): Int {
  return firstNumber + secondNumber
}