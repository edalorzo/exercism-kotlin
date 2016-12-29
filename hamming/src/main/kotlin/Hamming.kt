object Hamming {

    fun compute(dna1: String, dna2: String): Int {
        require(dna1.length == dna2.length)
        return dna1.zip(dna2).count { it.first != it.second }
    }

}
