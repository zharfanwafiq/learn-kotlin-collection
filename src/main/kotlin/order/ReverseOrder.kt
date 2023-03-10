package order

fun main() {
    reverseOrder()
}

fun reverseOrder() {
    val list = mutableListOf("Zharfan", "Wafiq", "Ganteng", "Sekali")
    val listReversed = list.reversed()
    val listAsReversed = list.asReversed()
    list.add("Developer")
    list.add("Android")
    println("Reversed : $listReversed")
    println("As Reversed :  $listAsReversed")
}