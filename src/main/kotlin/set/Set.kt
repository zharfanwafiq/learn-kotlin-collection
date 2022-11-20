package set

fun main(){
    set()
    mutableSet()
}

fun set(){
    val set: Set<Person> = setOf(
        Person("Zharfan Wafiq"),
        Person("Ahmad Dani"),
        Person("Fikri Aulia"),
        Person("Kholil Oktialdi")
    )

    println("Jumlah data ${set.size}")
    println(set.contains(Person("Ilham")))
    println(set.contains(Person("Zharfan Wafiq")))
}

fun mutableSet(){
    val mutableSet: MutableSet<Person>  = mutableSetOf()
    mutableSet.add(Person("Zharfan Wafiq"))
    mutableSet.add(Person("Ahmad Dani"))
    mutableSet.add(Person("Zharfan Wafiq"))
    mutableSet.add(Person("Yugi"))

    println(" Jumlah Data Awal ${mutableSet.size}")
    println("Zharfan Wafiq berada di indeks ke- ${mutableSet.indexOf(Person("Zharfan Wafiq"))}")
    println("Zhafan dihapus dari mutable set: ${mutableSet.remove(Person("Zharfan Wafiq"))}")
    println("Jumlah data terkini pada Mutable set: ${mutableSet.size}")
    println(mutableSet.contains(Person("Zharfan Wafiq")))

}
