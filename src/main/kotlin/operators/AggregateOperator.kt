package operators

fun main() {
    aggregateOperator()
}

fun aggregateOperator() {
    val number = (1..3).toList()
    println(number.max())
    println(number.min())
    println(number.average())
    println(number.sum())
    println(number.sumOf { it / 2 })
}
