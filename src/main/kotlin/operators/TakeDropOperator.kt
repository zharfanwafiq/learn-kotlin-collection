package operators

fun main() {
    takeDropOperator()
}

fun takeDropOperator() {
    val char = ('a'..'z').toList()

    println("Take 5 char: ${char.take(5)}")
    println("Take Last 2 Char: ${char.takeLast(2)}")
    println("Take while < f: ${char.takeWhile { it < 'f' }}")
    println("Take Last while > a: ${char.takeLastWhile { it > 'w' }}")

    println("Drop 23 char: ${char.drop(23)}")
    println("Drop Last 23 Char: ${char.dropLast(23)}")
    println("Drop while < x: ${char.dropWhile { it < 'x' }}")
    println("Drop Last while > c: ${char.dropLastWhile { it > 'c' }}")

}
