package collection

fun main() {
    displayCollection(listOf("Zharfan", "Wafiq", "Ganteng"))
    displayCollection(setOf("yami", "yugi", "Ganteng"))
    displayCollection(mapOf("key1" to "afgan").entries)
//    displayCollection(mapOf("key1" to "afgan")) // error karena bukan collection

    displayMutableCollection(mutableListOf("Zharfan", "Wafiq", "Ganteng"))
    displayMutableCollection(mutableSetOf("yami", "yugi", "Ganteng"))
    displayMutableCollection(mutableMapOf("key1" to "afgan").entries)
}

fun <T> displayCollection(collection: Collection<T>) {
    for (item in collection) println(item)
}

fun <T> displayMutableCollection(collection: MutableCollection<T>) {
    for (item in collection) println(item)
}