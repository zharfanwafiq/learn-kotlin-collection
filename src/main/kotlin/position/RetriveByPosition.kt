package position

fun main() {
    retriveByPosition()
}

fun retriveByPosition() {
    val list = listOf("Taufik", "Hidayat", "Zharfan", "Wafiq")
    println(list.first())
    println(list[0])
    println(list.elementAt(0))
    println(list.last())
    println(list.elementAt(1))
    println(list.elementAtOrNull(5))
    println(list.elementAtOrElse(5){"No data available"})
}
