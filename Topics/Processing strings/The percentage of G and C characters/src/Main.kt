fun main() {
    val cgStr = readln()
    var cg = 0.0
    for (i in cgStr) {
        if (i == 'c' || i == 'g' || i == 'C' || i == 'G') {
            cg++
        }
    }
    println(cg / cgStr.length.toDouble() * 100.0)
}