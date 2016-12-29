class DNA(val dna: String) {

    private val NUCLEOTIDES = "ACGT"

    init{ require(dna.matches(Regex("^([$NUCLEOTIDES]*)$")))}

    private val counts by lazy { dna.groupBy { it }.mapValues { it.value.size } }

    val nucleotideCounts: Map<Char, Int> by lazy { NUCLEOTIDES.map { n -> Pair(n, counts[n] ?: 0) }.toMap() }

    fun count(nucleotide:Char): Int {
        require(nucleotide in NUCLEOTIDES)
        return nucleotideCounts[nucleotide]!!;
    }

}
