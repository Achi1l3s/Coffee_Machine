const val FIVE = 5
fun main() {
    val (a, b, c, d, e) = List(FIVE) { readln().toInt() }
    when (e) {
        in a..b, in c..d -> println("true")
        else -> println("false")
    }
}
