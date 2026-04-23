package ejercicios

fun ejecutarBloque2() {
    println("========================================")
    println("   BLOQUE 2: NULL SAFETY")
    println("========================================")

    // 6. El Opcional
    val apodo: String? = null
    println("========================================")
    println("6. Apodo: $apodo")
    println("========================================")

    // 7. El Operador Elvis
    val resultadoApodo = apodo ?: "Sin apodo"
    println("========================================")
    println("7. Elvis dice: $resultadoApodo")
    println("========================================")

    // 8. Llamada Segura
    println("========================================")
    println("8. Longitud del apodo (segura): ${apodo?.length}")
    println("========================================")

    // 9. Uso de Let
    val correo: String? = "ejemplo@correo.com"
    println("========================================")
    print("9. ")
    correo?.let {
        println("Correo enviado a $it")
    } ?: println("No hay correo para enviar")
    println("========================================")

    // 10. Aserción No Nula
    val valorNoNulo: String? = "Kotlin"
    println("========================================")
    println("10. Longitud con !!: ${valorNoNulo!!.length}")
    println("========================================")
}
