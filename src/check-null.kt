fun main(args: Array<String>) {
    val x: Int? = null
    // println(x)


    // si x es null la conversion a toDouble()
    // tambien devolveria null y la variable y
    // seria null.
    // Para evitar eso podemos usar el
    // operador elvis/The Elvis Operator  ?:
    // si la conversion de toDouble()
    // nos devuelve null entonces devolvemos 0.0
    val y = x?.toDouble() ?: 0.0

    println(y)

    // El operador !! se usa para evitar la validacion
    // de campos null, en otras palabras evita la necesidad
    // de verificar si una variable puede ser null
    // se usaria en caso de que se este seguro
    // que una variable nunca sera null
    val z = x!!.toDouble()
    println(z)


    // Trabajando con Java o librerias escritas en Java
    // Si las bibliotecas usan correctamente las anotaciones
    // @Nullable ó @NotNull, se podra descubrir cuando una
    // variable podria ser null o no
    // Mas referencia sobre esto
    // https://antonioleiva.com/nullity-kotlin/
}