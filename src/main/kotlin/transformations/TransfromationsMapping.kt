package transformations

fun main() {
    transformationsMapping()
    transformationsMappingMap()
}

fun transformationsMapping() {
    println("----- Transformations Mapping -----")
    val list: List<String> = listOf("Zharfan", "Wafiq", "Ahmad", "Dani")
    val transformList: List<String> = list.map { item ->
        item.toUpperCase()
    }

    val transformList2: List<Int> = list.map { item ->
        item.length
    }

    val transformList3: List<String> = list.mapNotNull { value ->
        if (value == "Zharfan") value else null
    }

    val transformList4: List<String> = list.mapIndexed { index, item ->
        "Index ke-$index = $item"
    }

    val transformList5 = list.mapIndexedNotNull { index, value ->
        if (value == "Zharfan") "$value berada di index ke $index" else null
    }

    println(transformList)
    println(transformList2)
    println(transformList3)
    println(transformList4)
    println(transformList5)
}

fun transformationsMappingMap() {
    println("----- Transformations Mapping Map -----")

    val map: Map<Int, String> = mapOf(
        1 to "Zharfan",
        2 to "Wafiq",
        3 to "Ahmad",
        4 to "Dani"
    )

    val transformMap1 = map.mapKeys { it.key * 10 }
    val transformMap2 = map.mapValues { it.value.toUpperCase() }

    println(transformMap1)
    println(transformMap2)
}