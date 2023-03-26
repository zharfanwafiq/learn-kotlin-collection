package group

fun main() {
    groupingInterface()
}

fun groupingInterface() {
    val list = listOf("a", "b", "a", "c", "b", "c")
    val grouping = list.groupingBy { it }
    println(grouping.eachCount())
    println(grouping.fold("") { accumulator, element ->
        accumulator + element })

    println(grouping.reduce { _, accumulator, element ->
        accumulator + element })

    println(grouping.aggregate { _, accumulator: String?, element, first ->
        if (first) element else accumulator.plus(element)
    })
}
