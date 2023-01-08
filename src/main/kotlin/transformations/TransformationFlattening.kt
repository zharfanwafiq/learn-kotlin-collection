package transformations

fun main() {
    transformationFlattening()
    memberHobbies()
}

fun transformationFlattening() {
    val list: List<List<String>> = listOf(
        listOf("Zharfan", "Wafiq"),
        listOf("Ahmad", "Dani")
    )
    val flattenList: List<String> = list.flatten()
    println(flattenList)
    flattenList.forEachIndexed { index, s ->
        println("index $index = $s")
    }
}

class Member(val name: String, val hobbies: List<String>)

fun memberHobbies() {
    val members: List<Member> = listOf(
        Member("Zharfan Wafiq", listOf("Travelling", "Gaming")),
        Member("Ahmad Dani", listOf("Working", "Studying"))
    )

    val hobbies: List<String> = members.flatMap { it.hobbies }
    println("hobbies: $hobbies")
}