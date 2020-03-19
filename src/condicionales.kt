fun main(args: Array<String>) {

    var name:String = "Lucas"
    var animal:String = "perro"

    var result = add(5, 19)
//    if (result > 10) {
//        println("El resultado es mayor que 10")
//    }

//    if (name == ("Lucas")) {
//        println("Se llama Lucas")
//    } else {
//        println("No se llama Lucas")
//    }

    // No es buena practica hacer muchos aninamientos de if else
    // se puede usar and && y or ||
//    if (animal == "gato") {
//        println("Es un gato")
//    } else if (animal == "perro") {
//        println("es un perro")
//    } else if (animal == "pato") {
//        println("es un pato")
//    } else {
//        println("al parecer no es animal conocido")
//    }

    if (animal == "gato" || animal == "perro" || animal == "pato") {
        println("El animal es un $animal")
    }

}

fun add3(firstNumber:Int, secondNumber:Int):Int = firstNumber + secondNumber