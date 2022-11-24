package map

fun main() {
    map()
    mutableMap()
}

fun map() {

    //if we define type of data, we should type same like data type
    val map: Map<String, String> = mapOf(
        "person1" to "Zharfan Wafiq",
        "person2" to "Husnan Hidayat",
        "person3" to "Ahmad Dani"
    )

    println("Jumlah data map ${map.size}")

    println(map["person1"])
    println(map["person2"])
    println(map["person3"])

    //if we not define type of key and value, we can use all data type
    val map2 = mapOf(
        "key1" to "Zharfan Wafiq",
        "key2" to 2,
        2 to "value3"
    )
    println(map2[2])
}

fun mutableMap() {
    val mutableMap: MutableMap<String, Int> = mutableMapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3
    )

    println(mutableMap["key1"])
    println(mutableMap["key2"])
    println(mutableMap["key3"])

    val mutableMap2 = mutableMapOf<String, Int>()
    mutableMap2["key1"] = 1
    mutableMap2["key2"] = 2
    mutableMap2["key3"] = 3

    println(mutableMap2["key1"])
    println(mutableMap2["key2"])
    println(mutableMap2["key3"])

    val mutableMap3: MutableMap<String, Int> = mutableMapOf()
    mutableMap3["key1"] = 1
    mutableMap3["key2"] = 2
    mutableMap3["key3"] = 3

    println(mutableMap3["key1"])
    println(mutableMap3["key2"])
    println(mutableMap3["key3"])

    mutableMap3.replace("key1", 3)
    mutableMap3.remove("key2")
    println(mutableMap3["key1"])
    println(mutableMap3["key2"])
}