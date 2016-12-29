object Bob {

    fun hey(message: String): String {
        return when {
            isYelling(message.filter { it.isLetter() }) -> "Whoa, chill out!"
            message.endsWith("?") -> "Sure."
            message.isBlank() -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }

    private fun isYelling(letters: String) = letters.length > 0 &&  letters.all { it.isUpperCase() }

}
