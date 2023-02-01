package operators

fun main() {
    plusMinusOperator()
}

fun plusMinusOperator() {
    val list1 = listOf("Zharfan", "Wafiq", "Ahmad", "Dani")
    val list2 = list1.plus("Kholil")
    val list3 = list1.plus(listOf("Fikri", "Aulia", "Rahman"))
    val list4 = list1.minus("Ahmad")
    val list5 = list1.minus(listOf("Wafiq", "Ahmad", "Dani"))

    println("list1: $list1")
    println("list2: $list2")
    println("list3: $list3")
    println("list4: $list4")
    println("list5: $list5")

    val map1 = mapOf("a" to "Zharfan", "b" to "Wafiq")
    val map2 = map1.plus("c" to "Ganteng")
    val map3 = map1.minus("a")

    println("map1: $map1")
    println("map2: $map2")
    println("map3: $map3")
}