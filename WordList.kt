fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    val filteredWords = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled()
    println(filteredWords)
    val filteredWords1 = words.filter { it.startsWith("b", ignoreCase = true) }.shuffled().take(2).sorted()
    println(filteredWords1)
}
