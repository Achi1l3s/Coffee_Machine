@Suppress("MagicNumber")
fun main() {
    val (a, b, c, d, e) = List(5) { readln().toInt() }
    println(e in a..b || e in c..d)
}