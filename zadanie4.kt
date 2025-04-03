/**
 * Funkcja oblicza n pierwszych elementów ciągu Fibonacciego iteracyjnie.
 * @param n [Int] - liczba elementów do wygenerowania.
 * @return [List<Int>] - lista zawierająca n pierwszych liczb Fibonacciego.
 * @throws IllegalArgumentException - jeśli n jest liczbą ujemną.
 */
fun fibonacciIter(n: Int): List<Int> {
    if (n < 0) {
        throw IllegalArgumentException("Liczba n nie może być ujemna.")
    }

    val wynik = mutableListOf<Int>()
    if (n >= 1) wynik.add(0)
    if (n >= 2) wynik.add(1)

    for (i in 2 until n) {
        val nowa = wynik[i - 1] + wynik[i - 2]
        wynik.add(nowa)
    }

    return wynik
}

/**
 * Funkcja oblicza n pierwszych elementów ciągu Fibonacciego rekurencyjnie.
 * @param n [Int] - liczba elementów do wygenerowania.
 * @return [List<Int>] - lista zawierająca n pierwszych liczb Fibonacciego.
 * @throws IllegalArgumentException - jeśli n jest liczbą ujemną.
 */
fun fibonacciRek(n: Int): List<Int> {
    if (n < 0) {
        throw IllegalArgumentException("Liczba n nie może być ujemna.")
    }

    val wynik = mutableListOf<Int>()
    for (i in 0 until n) {
        wynik.add(fib(i))
    }

    return wynik
}

/**
 * Funkcja pomocnicza obliczająca n-ty element ciągu Fibonacciego rekurencyjnie.
 * @param n [Int] - indeks elementu ciągu.
 * @return [Int] - n-ty element ciągu Fibonacciego.
 */
fun fib(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    return fib(n - 1) + fib(n - 2)
}

fun main() {
    println("Iteracyjnie:")
    println(fibonacciIter(10))

    println("Rekurencyjnie:")
    println(fibonacciRek(10))
}
// Źródła wykorzystane w kodzie:
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/to-list.html
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/require.html
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/until.html
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/empty-list.html
