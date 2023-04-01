package operators

fun main() {
    listSpecificOperator()
}

fun listSpecificOperator() {
    val list = listOf("Zharfan", "Afdhal", "Wafiq", "Ganteng")
    println(list.getOrNull(1))
    println(list.getOrElse(3) { i -> "Error 404" })
    println(list.subList(0, 2))

    val sortedList = list.sorted() //element di urutkan berdasarkan abjad
    println(sortedList.binarySearch("Ganteng"))
    println("-------------------")

    val number = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)
    println(number.indexOf(2))
    println(number.lastIndexOf(3))
    println(number.indexOfFirst { it > 3 })
    println(number.indexOfLast { it > 3 })
    println(indexOfNumber(1, number))
}

fun indexOfNumber(number: Int, index: List<Int>) {
    println("Angka $number berada di ${index.indexOf(number)}")
}

fun lastOfNumber(number: Int, index: List<Int>) {
    println("Angka $number berada di ${index.lastIndexOf(number)}")
}

fun indexOfFirst(number: Int, index: List<Int>) {
    println("Index Pertama dari Kondisi $number, yaitu ${index.indexOfFirst { it > number }}")
}

fun indexOfLast(number: Int, index: List<Int>) {
    println("Index Terakhir dari Kondisi $number, yaitu ${index.indexOfLast { it > number }}")
}



