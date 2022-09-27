fun main() {
    val t = readln().toMutableList()
    if (t[0].digitToInt() + t[1].digitToInt() + t[2].digitToInt() == t[3].digitToInt() + t[4].digitToInt() + t[5].digitToInt()) {
        println("Lucky")
    } else {
        println("Regular")
    }
}