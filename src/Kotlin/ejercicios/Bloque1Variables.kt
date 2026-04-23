package ejercicios

object Constants {
    const val VELOCIDAD_LUZ = 299792458
}

fun ejecutarBloque1() {
    println("========================================")
    println("   BLOQUE 1: VARIABLES")
    println("========================================")

    // 1. Mi Perfil de Usuario
    val nombre = "Mateo Betancur"
    var ciudad = "Nariño - Ant"
    println("========================================")
    println("1. Nombre: $nombre, Ciudad inicial: $ciudad")
    ciudad = "Medellín"
    println("   Ciudad cambiada a: $ciudad")
    println("========================================")

    // 2. Calculadora de mi edad
    val anioNacimiento = 2007
    val anioActual = 2026
    val edad = anioActual - anioNacimiento
    println("========================================")
    println("2. Mi Año nacimiento: $anioNacimiento, Mi Edad aproximada: $edad")
    println("========================================")

    // 3. Tipos Explícitos
    val precioCoche: Double = 25000.50
    val pesoNaranja: Float = 0.25f
    val poblacionMundial: Long = 8200000000L
    println("========================================")
    println("3. Mi Coche: $$precioCoche, Una Naranja: ${pesoNaranja}kg, Población Total del mundo: $poblacionMundial")
    println("========================================")

    // 4. Inferencia
    val estaLloviendo = false
    println("========================================")
    println("4. Oe, ¿Está lloviendo? $estaLloviendo (Tipo inferido: ${estaLloviendo::class.simpleName})")
    println("========================================")

    // 5. Constantes Reales
    println("========================================")
    println("5. Velocidad de la luz: ${Constants.VELOCIDAD_LUZ} m/s")
    println("========================================")
}
