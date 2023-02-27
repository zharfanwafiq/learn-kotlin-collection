package position

fun main() {
    retriveByRandom()
    retriveByRandomString()
}

fun retriveByRandom() {
    val list = (1..100).toList()
    println(list.random())
    println(list.random())
    println(list.random())
    println(list.random())
}

fun retriveByRandomString(){
    val data = listOf<String>("Zharfan", "Wafiq", "Ganteng", "Sekali")
    println(data.random())
    println(data.random())
}
