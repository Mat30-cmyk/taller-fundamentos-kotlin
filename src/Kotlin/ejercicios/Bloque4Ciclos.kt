package ejercicios

fun ejecutarBloque4 () {
    header("BLOQUE 4: CICLOS")

    // Conteo ascendente
    print("16. Secuencia: ")
    (1..10).forEach { print("$it ") }
    println()
    line()

    // Conteo descendente
    print("17. Regresivo: ")
    for (num in 10 downTo 1) {
        print("$num ")
    }
    println()
    line()

    // Incrementos
    print("18. Saltos: ")
    for (num in 1..20 step 3) {
        print("$num ")
    }
    println()
    line()

    // While
    var battery = 5
    print("19. Batería: ")
    while (battery > 0) {
        print("[$battery] ")
        battery--
    }
    println("Agotada")
    line()

    // Do-while
    var password: String
    var tries = 0

    println("20. Validación de acceso:")
    do {
        password = if (tries < 2) "fail" else "1234"
        println("Intento ${tries + 1}: '$password'")
        tries++
    } while (password != "1234")

    println("Acceso permitido")
}