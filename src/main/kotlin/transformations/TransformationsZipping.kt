package transformations

fun main() {
    transformationsZipping()
    transformationsUnzipping()
}

fun transformationsZipping() {
    println("-------- Transformations Zipping --------")
    val listA = listOf("Zharfan", "Wafiq")
    val listB = listOf("Ahmad", "Dani")
    val zipList: List<Pair<String, String>> = listA.zip(listB)
    val listC = listA.zip(listB) { itemA, itemB ->
        itemA + itemB
    }

    println(zipList)
    println(listC)
}

fun transformationsUnzipping(){
    println("-------- Transformations Unzipping --------")
    val list: List<Pair<String,String>> = listOf(
        "Zharfan" to "Wafiq",
        "Ahmad" to "Dani"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair)
}

