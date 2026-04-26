package ejercicios.collections

// Extensiones
fun Int.isNegative(): Boolean = this < 0

fun String.removeSpaces(): String = replace(" ", "")

fun ejecutarBloque6() {
    title("BLOQUE 6: COLECCIONES Y EXTENSIONES")

    // Lista
    val shoppingList = mutableListOf("Leche", "Pan", "Huevos")
    println("26. Inicial: $shoppingList")

    shoppingList.add("Café")
    shoppingList.removeAt(1)

    println("Actualizada: $shoppingList")
    line()

    // Filtro
    val prices = listOf(10, 55, 25, 100, 40, 80)
    val filtered = prices.filter { it < 50 }

    println("27. Menores a 50: $filtered")
    line()

    // Búsqueda
    val friends = listOf("Juan", "Alicia", "Pedro", "Ana")
    val result = friends.firstOrNull { it.startsWith("A") }

    println("28. Encontrado: $result")
    line()

    // Extensión Int
    val value = -5
    println("29. ¿Negativo? ${value.isNegative()}")
    line()

    // Extensión String
    val messyText = "K o t l i n   e s   g e n i a l"
    println("30. Original: '$messyText'")
    println("Limpio: '${messyText.removeSpaces()}'")
}

fun title(text: String) {
    println("\n=== $text ===")
}

fun line() {
    println("----------------------------")
}