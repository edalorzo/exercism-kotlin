
object RnaTranscription {

	fun ofDna(dna:String) : String {
		return dna.map {
			when(it) {
				'G' -> "C"
				'C' -> "G"
				'T' -> "A"
				'A' -> "U"
				else -> ""
			}
		}.joinToString("")
	}
}