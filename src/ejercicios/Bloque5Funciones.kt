package ejercicios.funciones

fun greetUser(name: String): String =
    "Hola $name, bienvenido 👋"

fun addNumbers(x: Int, y: Int): Int = x + y

fun drawRectangle(width: Int, height: Int = 10) {
    println("Rectángulo -> ancho: $width | alto: $height")
}

fun convertUsdToCop(amount: Double): Double {
    val exchangeRate = 4000.0
    return amount * exchangeRate
}

fun ejecutarBloque5() {
    printTitle("BLOQUE 5: FUNCIONES")

    // Saludo
    println("21. ${greetUser("Jhon")}")
    divider()

    // Suma
    val total = addNumbers(15, 30)
    println("22. Resultado suma: $total")
    divider()

    // Default param
    println("23. Rectángulo básico:")
    drawRectangle(5)
    divider()

    // Named args
    println("24. Rectángulo personalizado:")
    drawRectangle(width = 20)
    divider()

    // Conversión
    val dollars = 50.0
    val converted = convertUsdToCop(dollars)
    println("25. $dollars USD -> $converted COP")
}

fun printTitle(text: String) {
    println("\n=== $text ===")
}

fun divider() {
    println("---------------------------")
}