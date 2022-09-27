import kotlin.random.Random

fun main() {
    val inp = readln()
    val sb = StringBuffer(inp)
    val randomInt = Random()

    if (inp.length % 2 == 0) {
        println(inp.removeRange(inp.length / 2 - 1, inp.length / 2 + 1))
    } else {
        val middle = inp.length / 2
        println(sb.deleteCharAt(middle))
    }
}