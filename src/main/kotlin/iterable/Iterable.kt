package iterable

fun main(){
    iterable()
    mutableIterable()
}

fun iterable() {
    displayIterable(listOf("Zharfan","Wafiq"))
    displayIterable(listOf("Ahmad","Dani"))
    displayIterable(listOf("Kholil","Oktialdi"))

}

fun <T> displayIterable(iterable: Iterable<T>){
    val iterator = iterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}

fun mutableIterable(){
    displayMutableIterable(mutableListOf("Ahmad","Dani"))
    displayMutableIterable(mutableListOf("Zharfan", "Wafiq"))
    displayMutableIterable(mutableListOf("Kholil", "Oktialdi"))

}

fun <T> displayMutableIterable(mutableIterable: MutableIterable<T>){
    val iterator = mutableIterable.iterator()
    while (iterator.hasNext()) println(iterator.next())
}
