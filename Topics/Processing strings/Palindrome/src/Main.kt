fun main() {
    val word = readln()
    var forth = ""
    var back = ""
    for (i in word.indices) {
        forth += word[i]
    }
    for (i in word.length - 1 downTo 0) {
        back += word[i]
    }

    if (forth == back) println("yes") else println("no")
}