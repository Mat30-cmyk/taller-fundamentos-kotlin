package ejercicios

fun ejecutarBloque3() {
    showHeader("BLOQUE 3: CONDICIONALES")

    // Mayor de edad
    val age = 20
    println(if (age >= 18) "11. Tiene permiso para votar" else "11. No cumple la edad")
    divider()

    // If como expresión
    val grade = 4.2
    val status = if (grade >= 3.0) "Aprobado" else "Reprobado"
    println("12. Estado: $status")
    divider()

    // Semáforo
    val trafficLight = "Rojo"
    println("13. Estado del semáforo: $trafficLight")

    val action = when (trafficLight) {
        "Rojo" -> "Detenerse"
        "Amarillo" -> "Precaución"
        "Verde" -> "Avanzar"
        else -> "No reconocido"
    }
    println(action)
    divider()

    // Temperatura
    val temp = 22
    val climate = when {
        temp < 15 -> "Hace frío"
        temp in 15..25 -> "Clima templado"
        else -> "Hace calor"
    }
    println("14. $climate")
    divider()

    // Tipo de dato
    val randomValue: Any = "Soy un String"
    val typeResult = when (randomValue) {
        is String -> "Cadena de texto"
        is Int -> "Número entero"
        is Boolean -> "Booleano"
        else -> "Desconocido"
    }
    println("15. Tipo detectado: $typeResult")
    divider()
}

fun showHeader(title: String) {
    println("========================================")
    println("   $title")
    println("========================================")
}

fun divider() {
    println("========================================")
}