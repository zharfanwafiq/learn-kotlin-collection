package filter

fun main() {
    filtering()
}

fun filtering() {
    val list1 = listOf("Zharfan", "Wafiq", "Ahmad", "Dani")
    val list2 = list1.filter { it.length > 5 }
    val list3 = list1.filterNot { it.length > 5 }
    val list4 = list1.filterIndexed { index, _ -> index % 2 == 0 }
    val list5: List<Any?> = listOf(null, "Zharfan", "Wafiq", 1, 2, null)
    val list6: List<String> = list5.filterIsInstance<String>()
    val list7: List<Any> = list5.filterNotNull()

    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)
    println(list6)
    println(list7)

}