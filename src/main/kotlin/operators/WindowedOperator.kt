package operators

fun main() {
    windowedOperator()
}

fun windowedOperator() {
    val range = (1..5).toList()
    println(range.windowed(3, 1, false))
    println(range.windowed(3, 1, false) { it.size })
    println(range.windowed(3, 1, true))
    println(range.windowed(3, 1, true) { it.size })
    println(range.windowed(3, 2, false))
    println(range.windowed(3, 2, true))
}

