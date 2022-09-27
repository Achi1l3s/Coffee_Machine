const val THREE = 3

fun main() {
    val vowels = "aeiouy"
    val read = readln()
    var countVow = 0
    var countCon = 0
    var need = 0

    for (i in read) {
        if (vowels.contains(i)) {
            countVow++
            countCon = 0
            if (countVow == THREE) {
                need++
                countVow = 1
            }
        } else {
            countCon++
            countVow = 0
            if (countCon % THREE == 0) {
                need++
                countCon = 1
            }

        }
    }
    println(need)
}