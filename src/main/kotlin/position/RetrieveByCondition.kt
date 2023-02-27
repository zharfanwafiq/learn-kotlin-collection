package position

fun main() {
    retrieveByCondition()
}

fun retrieveByCondition() {
    val list = (1..20).toList()
    println(list.first { it > 10 })
    println(list.last { it > 10 })
    println(list.firstOrNull { it > 20 })
    println(list.lastOrNull { it > 20 })
    println(list.find { it > 20 })
    println(list.findLast { it > 20 })
}
