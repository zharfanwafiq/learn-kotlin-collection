package operators

fun main() {
    chunkedOperator()
}

fun chunkedOperator() {
    val range = (1..100).toList()
    val list1 = range.chunked(10)
    val list2 = range.chunked(10) { list ->
        var total = 0
        list.forEach { number ->
            total += number
        }
        total
    }

    println("list1:${list1}")
    println("list1:${list2}")
}
