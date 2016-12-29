object RomanNumeral {

    private val OFSSET = '0'.toInt()

    private val ROMANS = listOf(
            listOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"),
            listOf("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"),
            listOf("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"),
            listOf("M", "MM", "MMM"))

    fun value(n: Int): String {
        return n.toString()
                .reversed()
                .map { it.toInt() - OFSSET }
                .foldIndexed("") { idx, acc, n -> if (n > 0) ROMANS[idx][n - 1] + acc else acc }
    }

}
