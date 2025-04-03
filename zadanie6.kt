/**
 * Funkcja generuje komplementarną nić DNA.
 * @param dna [String] - nić DNA.
 * @return [String] - komplementarna nić.
 */

fun komplement(dna: String): String {
    var wynik = ""
    for (znak in dna) {
        if (znak == 'A') wynik += 'T'        
        else if (znak == 'T') wynik += 'A'    
        else if (znak == 'C') wynik += 'G'    
        else if (znak == 'G') wynik += 'C'    
        else throw IllegalArgumentException("Nieprawidłowy znak: $znak")

    }
        return wynik
    }

/**
 * Funkcja transkrybuje nić matrycową DNA na sekwencję RNA.
 * @param dna [String] - nić DNA.
 * @return [String] - nić RNA.
 */

fun transkrybuj(dna: String): String {
    var wynik = ""
    for (znak in dna) {
        if (znak == 'A') wynik += 'U'
        else if (znak == 'T') wynik += 'A'
        else if (znak == 'C') wynik += 'G'
        else if (znak == 'G') wynik += 'C'
        else throw IllegalArgumentException("Nieprawidłowy znak: $znak")
    }

    return wynik
}

fun main() {
    println("Podaj nić kodującą DNA (użyj tylko A, T, C, G):")

    val kodujaca = readLine()?.uppercase() ?: ""

    if (kodujaca.isEmpty()) {
        println("Nie podano żadnej sekwencji.")
        return
    }

    val matrycowa = komplement(kodujaca)
    println("Nić matrycowa DNA:     $matrycowa")

    val rna = transkrybuj(matrycowa)
    println("Sekwencja RNA:         $rna")

}
// Źródła wykorzystane w kodzie:
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/
//https://kotlinlang.org/docs/control-flow.html#for-loops
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/
//https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/uppercase/
