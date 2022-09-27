fun main() {
    val color = readln()
    //val find = Rainbow.valueOf(color)
    val f = findByColor(color)

    println(f.ordinal)
}

enum class Rainbow(val color: String) {
    NULL(""),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");
}

fun findByColor(color: String): Rainbow {
    for (enum in Rainbow.values()) {
        if (color == enum.color) return enum
    }
    return Rainbow.NULL
}
