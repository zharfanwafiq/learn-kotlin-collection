package order

fun main() {
    naturalOrdering()
}

fun naturalOrdering() {
    val number = listOf(1, 2, 5, 541, 45, 4, 8)
    println(number.sorted())
    println(number.sortedDescending())
}
