object Pangrams {

    private val alphabet = 'a'..'z'

    fun isPangram(text: String) = alphabet.all { text.toLowerCase().contains(it) }

}
