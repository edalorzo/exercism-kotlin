class Anagram(val word: String) {

    private val letters = getLetterCount(word)

    fun match(words: List<String>): List<String> {
        return words.filter { it.toLowerCase() != word }
                .filter { getLetterCount(it).equals(letters)}
    }

    fun getLetterCount(word: String) = word.toLowerCase().groupBy { it }.map { it.key to it.value.size }.toMap()

}
