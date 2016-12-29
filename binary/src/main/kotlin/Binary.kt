object Binary {

    fun toDecimal(binary: String): Int {
        return if (binary.matches(Regex("^[01]+$")))
            binary.reversed()
                  .mapIndexed { i, c -> if (c == '0') 0 else 1 shl i }
                  .sum()
        else 0
    }

}
