// Main.kt
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Program Penjumlahan Sederhana")
    val a = 20
    val b = 5
    val c = add(a, b)
    val b = 10
    println(c)
    println(c)

    val numbers = mutableListOf<Int>()
    for (i in 1..10) {
        numbers.add(i)  // Bug: memory bisa terus bertambah tanpa dibersihkan
    }
    println("Total numbers: ${numbers.size}")
    numbers.clear()
}
