package iterator

fun main() {
//    iterator()
    mutableListIterator()
}

fun iterator() {
    displayListIterator((listOf("Zharfan", "Wafiq", "Ganteng")).listIterator())
    displayListIterator((listOf("Ahmad", "Dani", "Kholil")).listIterator())

}

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    while (listIterator.hasNext()) println(listIterator.next())
    while (listIterator.hasPrevious()) println(listIterator.previous())
}


fun mutableListIterator() {
    removeOddNumber(mutableListOf(1, 2, 3, 4, 5, 6, 7).listIterator())
    displayMutableListIterator(mutableListOf(1, 2, 3, 4, 5, 6).listIterator())
}

fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()) println(mutableListIterator.next())
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val item = mutableListIterator.next()
        if (item % 2 == 1) mutableListIterator.remove() else println(mutableListIterator.next())
    }
}

