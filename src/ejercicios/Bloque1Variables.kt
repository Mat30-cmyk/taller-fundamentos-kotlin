package ejercicios

object GlobalConfig {
    const val LIGHT_SPEED = 299_792_458
}

fun ejecutarBloque1() {
    printHeader("BLOQUE 1: VARIABLES")

    // Perfil
    val userName = "Mateo Betancur"
    var location = "Nariño - Ant"
    println("Nombre: $userName | Ubicación inicial: $location")

    location = "Medellín"
    println("Ubicación actualizada: $location")
    separator()

    // Edad
    val birthYear = 2007
    val currentYear = 2026
    val userAge = currentYear - birthYear

    println("Nacimiento: $birthYear | Edad estimada: $userAge")
    separator()

    // Tipos explícitos
    val carPrice: Double = 25000.50
    val orangeWeight: Float = 0.25f
    val worldPopulation: Long = 8_200_000_000L

    println("Auto: $$carPrice | Naranja: ${orangeWeight}kg | Población: $worldPopulation")
    separator()

    // Inferencia
    val isRaining = false
    println("¿Está lloviendo? $isRaining -> Tipo: ${isRaining::class.simpleName}")
    separator()

    // Constante
    println("Velocidad de la luz: ${GlobalConfig.LIGHT_SPEED} m/s")
    separator()
}

fun printHeader(title: String) {
    println("========================================")
    println("   $title")
    println("========================================")
}

fun separator() {
    println("========================================")
}