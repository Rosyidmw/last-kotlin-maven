// Main.kt
fun add(a: Int, b: Int): Int? {
    if (a < 0 || b < 0) {
        return null // berpotensi NullPointerException jika tidak di-handle
    }
    return a + b
}

fun main() {
    println("Program Penjumlahan Sederhana")
    val a = -1
    val b = 10
    val c = add(a, b)
    println(c)
    println(c)
}
