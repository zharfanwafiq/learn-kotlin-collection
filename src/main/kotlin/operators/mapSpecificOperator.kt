package operators

fun main() {
    mapSpesificOperator()
}

fun mapSpesificOperator() {
    val map = mapOf(
        "a" to "Zharfan",
        "b" to "Ahmad",
        "c" to "Dani",
        "d" to "Wafiq"
    )

    val getValue = map.getValue("a")
    val getOrElse = map.getOrElse("e") { "Error 404" }
    val filter = map.filter { (_, value) -> value.length > 5 }
    val filterKeys = map.filterKeys { key -> key > "a" }
    val filterValues = map.filterValues { value -> value.length > 5 }


    println(getValue)
    println(getOrElse)
    println(filter)
    println(filterKeys)
    println(filterValues)
}
