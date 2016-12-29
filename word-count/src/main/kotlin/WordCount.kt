object WordCount {
    fun phrase(text: String): Map<String, Int> {
        return Regex("([a-zA-Z_0-9'])+").findAll(text.toLowerCase())
                .groupBy { it.value }
                .map { it.key to it.value.size }
                .toMap()
    }
}
