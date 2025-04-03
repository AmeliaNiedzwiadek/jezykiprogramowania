/**
 * Funkcja generuje ciąg Collatza dla zadanej liczby początkowej c0.
 * @param c0 [Int] - liczba początkowa, musi być większa od zera.
 * @return [List]<[Int]> - lista zawierająca kolejne wartości ciągu Collatza.
 * @throws IllegalArgumentException - jeśli podana liczba jest mniejsza lub równa zero.
 */
fun collatz(c0: Int): List<Int> {
    if (c0 <= 0) {
        throw IllegalArgumentException("c0 musi być większe od zera.")
    }

    val wynik = mutableListOf<Int>()
    var c = c0

    while (c != 1) {
        wynik.add(c)
        c = if (c % 2 == 0) c / 2 else 3 * c + 1
    }

    wynik.add(1)
    return wynik
}

fun main() {
    val liczba = 7 // Początek ciągu
    val ciag = collatz(liczba)

    println("Ciąg Collatza dla $liczba:")
    println(ciag)
}
// Źródła wykorzystane w kodzie:
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/mutable-list-of/
