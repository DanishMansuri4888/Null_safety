fun main() {
    val name: String? = null

    println(name?.length)

    println(name?.length ?: 0)

    try {
        println(name!!.length)
    } catch (e: NullPointerException) {
        println("Error: ${e.message}")
    }
}

