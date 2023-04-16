package map

fun main() {
    val map = mapOf(
        "a" to "Zharfan",
        "b" to "Wafiq",
        "c" to "Fikri",
        "d" to "Aulia"
    )

    for ((key, value) in map) {
        println("$key, $value")
    }

    map.forEach { (key, value) -> println("$key, $value") }
    map.forEach { entry ->
        println("${entry.component1()}: ${entry.component2()}")
    }
}