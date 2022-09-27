@Suppress("All")
fun main() {
    val (a, b, c) = List(3) { readln().toInt() }
    println(a in b..c)
}
