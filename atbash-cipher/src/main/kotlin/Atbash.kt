object Atbash {


    private val cipher = ('a'..'z').zip('z' downTo  'a').toMap()
    private val decipher = ('z' downTo 'a').zip('a'..'z').toMap()

    fun encode(source: String): String {
        return source.toLowerCase().map { cipher[it] ?: it }.joinToString("")
    }

    fun decode(source: String): String {
        return source.toLowerCase().map { decipher[it] ?: it}.joinToString("")
    }

}
