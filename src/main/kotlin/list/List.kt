package list

fun main() {

    immutableList()
    mutableList()
}

fun immutableList() {
    val list: List<String> = listOf("Zharfan", "Wafiq", "Ahmad", "Dani")
    println(list[0])
    println(list[1])
    println(list[2])
    println(list)
//    println(list.isEmpty()) //same with println(list.size == 0)
    println(list.indexOf("Zharfan"))
    println(list.indexOf("Ahmad"))
}

fun mutableList() {
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Zharfan")
    mutableList.add("Wafiq")
    mutableList.add("Ahmad")
    mutableList.add("Dani")
    println(mutableList[0])
    println(mutableList[1])
    println(mutableList.isEmpty())

    println(mutableList)
    mutableList[2] = "Anggur"
    mutableList.set(3, "Jeruk")

    println(mutableList)
}