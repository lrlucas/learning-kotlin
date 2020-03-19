
/**
 * Condicional When es un remplazo de Switch
 *
 *
 */

fun main(args: Array<String>) {
    getMonth(5)
    getMonthByTrimestral(5)
    getMonthBySemester(9)
    result(true)
}

fun result(value:Any) {
    when (value) {
        is Int -> println(value + 1)
        is String -> println("El texto es $value")
        is Boolean -> if (value) println("es verdadero") else println("es falso")
        else ->
            println("No es tipo valido")
    }
}



fun getMonthBySemester(month:Int) {
    when (month) {
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        !in 1..12 -> println("No es mes valido")
    }
}

fun getMonthByTrimestral(month: Int) {
    when (month) {
        1,2,3 -> println("Primer trimestre del año")
        4,5,6 -> println("Segundo trimestre del año")
        7,8,9 -> println("Tercer trimestre del año")
        10,11,12 -> println("Cuarto trimestre del año")
    }
}

fun getMonth(month:Int) {
    when (month) {
     1 -> println("January")
     2 -> println("February")
     3 -> println("March")
     4 -> println("April")
     5 -> println("May")
     6 -> println("June")
     7 -> println("july")
     8 -> println("August")
     9 -> println("September")
     10 -> println("October")
     11 -> println("November")
     12 -> println("December")
        else -> {
            println("No corresponte a ningun mes del año")
        }
    }
}

