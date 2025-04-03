/**
 * Funkcja zwraca część wspólną dwóch list.
 * @param x [List<Int>] - pierwsza lista.
 * @param y [List<Int>] - druga lista.
 * @return [List<Int>] - lista zawierająca wspólne elementy.
 */

fun wspolne(x: List<Int>, y: List<Int>): List<Int> {

    val wynik = mutableListOf<Int>()
    val yKopia = y.toMutableList()
    for (el in x) {
        if (yKopia.contains(el)) {
            wynik.add(el)
            yKopia.remove(el)
        }
    }

    return wynik
}
fun main() {
    val x = listOf(1, 9, 2, 3)
    val y = listOf(2, 2, 4)

    val czescWspolna = wspolne(x, y)

    println(czescWspolna)
}
// Źródła wykorzystane w kodzie:
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/contains/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-mutable-list/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-list/remove/