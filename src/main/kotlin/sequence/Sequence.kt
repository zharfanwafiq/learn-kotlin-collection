package sequence

fun main() {
    learnSequence()
}

fun learnSequence() {
    println("----- Not a Sequence-----")
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthList = words
        .filter {
            println("Filter: $it")
            it.length > 3
        }
        .map {
            println("Map: $it")
            it.toUpperCase()
        }
        .take(4)
    println(lengthList)


    println("----- Sequence -----")
    val sequence = words.asSequence()
    val resultSequence = sequence
        .filter {
            println("Filter: $it")
            it.length > 3
        }
        .map {
            println("Map: $it")
            it.toUpperCase()
        }
        .take(4)
    println(resultSequence.toList())
}
