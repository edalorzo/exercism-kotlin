object Acronym {

    private val ACRONYM = Regex("([A-Z]+[a-z]*)|([a-z]+)")

    fun generate(text: String): String {
        return ACRONYM.findAll(text)
                .map { it.value.toUpperCase().first() }
                .joinToString("")
    }
}
