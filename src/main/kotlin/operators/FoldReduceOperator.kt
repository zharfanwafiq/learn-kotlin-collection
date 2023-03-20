package operators

fun main() {
    foldReduce()
}

fun foldReduce() {
    val number = (1..100).toList()
    val max = number.reduce {first, second ->
        if (first > second) first else second
    }

    val min = number.reduce {first, second ->
        if (first < second) second else first
    }

    val sum = number.fold(0) {first, second ->
        first + second
    }

    println(min)
    println(max)
    println(sum)
}
