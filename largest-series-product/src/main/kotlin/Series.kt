class Series(val series: String) {

    init {
        require(series.matches(Regex("\\d*")))
    }

    private val offset = '0'.toLong();

    fun getLargestProduct(n: Int): Long {
        require(n >= 0 && series.length >= n)

        val limit = (series.length - n)

        return (0..limit).map { x -> series.substring(x, x + n) }
                .map { token -> product(token) }.max() ?: 0
    }

    private fun product(token: String): Long {
        tailrec fun loop(digits:String, acc: Long): Long {
            return when {
                digits.isEmpty() -> acc
                digits.first() == '0' -> 0
                else -> loop(digits.substring(1), acc * (digits[0].toLong() - offset))
            }
        }
        return loop(token, 1)
    }

}
