package transformations

fun main() {
    transformationsStringRepresentation()
}

fun transformationsStringRepresentation() {
    val names = listOf("Zharfan", "Wafiq", "Ahmad", "Dani")
    println(names.joinToString(" ", "|", "|"))
    println(names.joinToString(" ", "|", "|"))


    val appendable = StringBuilder()
    names.joinTo(appendable, ", ", "|", "|")
    println(appendable.toString())
}