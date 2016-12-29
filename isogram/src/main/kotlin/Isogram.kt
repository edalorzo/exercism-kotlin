object Isogram {

    fun isIsogram(word: String) =
            word.toLowerCase()
                .groupBy { it }
                .filter { it.key.isLetter() }
                .map { it.key to it.value.size }
                .toMap().values.all { it == 1 }

}
