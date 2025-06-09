// Main.kt
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Program Penjumlahan Sederhana")
    val a = 10
    val b = 15
    val c = add(a, b)
    println(c)
    println(c)

    val numbers = mutableListOf<Int>()
    for (i in 1..100) {
        numbers.add(i)  // Bug: memory bisa terus bertambah tanpa dibersihkan
    }
    // println("Total numbers: ${numbers.size}")
    // numbers.clear()
}
