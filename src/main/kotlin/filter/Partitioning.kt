package filter

fun main(){
    filteringPartitioning()
}

fun filteringPartitioning() {
    val list = listOf("Zharfan", "Wafiq", "Wiza", "Dzakwan")
    val (listMatch, listNotMatch) = list.partition { it.length > 5 }
    println(list)
    println(listMatch)
    println(listNotMatch)
}
