package collection

fun main() {
    collectionOperation()
}

fun collectionOperation() {
    listOf("Zharfan", "Wafiq").forEach { value -> println(value) }
    listOf("Ahmad", "Dani", "Zhafan", "Wafiq").forEachIndexed { index, value ->
        println("$index = $value")
    }
}