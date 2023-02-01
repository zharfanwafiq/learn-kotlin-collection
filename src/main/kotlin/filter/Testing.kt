package filter

fun main() {
    filteringTesting()
}

fun filteringTesting() {
    val list = listOf("Zharfan", "Wafiq", "Wiza", "Dzakwan")
    println(list.any { it.length > 5 })
    println(list.none { it.length > 5 })
    println(list.all { it.length > 5 })
    println(list.any())
    println(list.none())
}
