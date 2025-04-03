/**
 * Funkcja generuje wszystkie możliwe podzbiory danej listy ciągów znaków.
 * @param x [List<String>] - lista elementów wejściowych, dla której mają zostać wygenerowane podzbiory.
 * @return [List<List<String>>] - lista wszystkich możliwych podzbiorów.
 * @throws IllegalArgumentException - jeśli lista wejściowa jest pusta.
 */
fun podzbiory(x: List<String>): List<List<String>> {
    if (x.isEmpty()) {
        throw IllegalArgumentException("Lista nie może być pusta.")
    }
    val wynik = mutableListOf<List<String>>()
    wynik.add(listOf())
    for (element in x) {
        val nowePodzbiory = mutableListOf<List<String>>()
        for (istniejacy in wynik) {
            val nowy = istniejacy + element
            nowePodzbiory.add(nowy)
        }

        wynik.addAll(nowePodzbiory)
    }

    return wynik
}
fun main() {
    val zbior = listOf("a", "b", "c", "d", "e")
    val podzbioryList = podzbiory(zbior)

    for (podzbior in podzbioryList) {
        println(podzbior)
    }
}
// Źródła wykorzystane w kodzie:
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-collection/add-all/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/mutable-list-of/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/
