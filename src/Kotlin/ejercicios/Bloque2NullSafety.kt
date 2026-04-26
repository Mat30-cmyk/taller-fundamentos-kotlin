package ejercicios

fun ejecutarBloque2() {
    header("BLOQUE 2: NULL SAFETY")

    // Nullable
    val nickName: String? = null
    println("Alias actual: $nickName")
    line()

    // Elvis
    val displayName = nickName ?: "Usuario sin alias"
    println("Valor final: $displayName")
    line()

    // Safe call
    val nickLength = nickName?.length
    println("Longitud del alias: $nickLength")
    line()

    // let
    val email: String? = "ejemplo@correo.com"
    print("Email -> ")
    email?.let { mail ->
        println("Enviando mensaje a $mail")
    } ?: println("No se pudo enviar, email nulo")
    line()

    // Not-null assertion
    val language: String? = "Kotlin"
    println("Tamaño del texto: ${language!!.length}")
    line()
}

fun header(text: String) {
    println("========================================")
    println("   $text")
    println("========================================")
}

fun line() {
    println("========================================")
}