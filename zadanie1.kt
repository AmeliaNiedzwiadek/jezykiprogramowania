/**
 * Funkcja oblicza pole trójkąta na podstawie wzoru Herona.
 * @param a [Double] - długość pierwszego boku trójkąta.
 * @param b [Double] - długość drugiego boku trójkąta.
 * @param c [Double] - długość trzeciego boku trójkąta.
 * @return [Double] - pole trójkąta.
 * @throws IllegalArgumentException - jeśli boki nie mogą utworzyć trójkąta.
 */
fun heron(a: Double, b: Double, c: Double): Double {
    if (a <= 0 || b <= 0 || c <= 0) {
        throw IllegalArgumentException("Boki muszą być dodatnie.")
    }
    if (a + b <= c || a + c <= b || b + c <= a) {
        throw IllegalArgumentException("Z tych boków nie da się zbudować trójkąta.")
    }
    val p = (a + b + c) / 2
    return kotlin.math.sqrt(p * (p - a) * (p - b) * (p - c))
}
fun main () {

    println(heron(2.0, 4.0, 5.0))

}

// Źródła wykorzystane w kodzie:
// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.math/sqrt/
// Źródło dokumentacji wyjątku: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/