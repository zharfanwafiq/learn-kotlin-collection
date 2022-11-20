package pair

fun main() {
    pair()
}

fun pair() {
    val pair = Pair(TAG, "Wafiq")

    println(pair.first)
    println(pair.second)

    val pair2: Pair<String, Int> = Pair("String", 1)

    println(pair2.first)
    println(pair2.second)

    val pair3: Pair<String, Int> = "String" to 1

    println(pair3.first)
    println(pair3.second)

}

const val TAG = "uwehaiofhapi"
