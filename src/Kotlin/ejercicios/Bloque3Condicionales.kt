package ejercicios

fun ejecutarBloque3() {
    println("========================================")
    println("   BLOQUE 3: CONDICIONALES     ")
    println("========================================")

    // 11. Mayoría de Edad
    println("========================================")
    val edad = 20
    if (edad >= 18) {
        println("11. Puede votar")
    } else {
        println("11. No puede votar")
    }
    println("========================================")

    // 12. If como Expresión
    val nota = 4.2
    val resultado = if (nota >= 3.0) "Aprobado" else "Reprobado"
    println("========================================")
    println("12. Resultado académico: $resultado")
    println("========================================")

    // 13. Semáforo
    val colorSemaforo = "Rojo"
    println("========================================")
    print("13. Semáforo en $colorSemaforo: ")
    println("========================================")
    when (colorSemaforo) {
        "Rojo" -> println("Detengase")
        "Amarillo" -> println("Hagale Pero con cuidado")
        "Verde" -> println("Continue su camino")
        else -> println("Color inválido")
    }

    // 14. Rangos en When
    val temperatura = 22
    println("========================================")
    print("14. Temperatura $temperatura°C: ")
    println("========================================")
    when {
        temperatura < 15 -> println("Que Frío!!")
        temperatura in 15..25 -> println("Esta Templado")
        temperatura > 25 -> println("Que Calor!!")
    }

    // 15. Verificación de Tipo
    val variableAnonima: Any = "Soy un String"
    println("========================================")
    print("15. Tipo de dato: ")
    println("========================================")
    when (variableAnonima) {
        is String -> println("Es un String")
        is Int -> println("Es un Int")
        is Boolean -> println("Es un Booleano")
        else -> println("Tipo desconocido")
    }
}
