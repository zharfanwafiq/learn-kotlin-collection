package operators

fun main() {
    setSpesificOperator()
}

fun setSpesificOperator() {
    val number1 = (1..10).toSet()
    val number2 = (6..15).toSet()

    val union = number1 union number2
    val intersect = number1 intersect number2
    val subtractA = number1 subtract number2
    val subtractB = number2 subtract number1

    println("Gabungan: $union")
    println("irisan: $intersect")
    println("Selisih A: $subtractA")
    println("Selisish B: $subtractB")
}
