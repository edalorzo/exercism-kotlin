object Raindrops {

    fun factors(n: Int): List<Int> {
        val factors = mutableListOf<Int>()
        var m = n
        var d = 2
        while(m > 1){
            while(m % d == 0) {
                factors.add(d)
                m /= d
            }
            d += 1
        }
        return factors
    }

    fun convert(n: Int): String {
        return factors(n).distinct().filter { it < 8 }.map {
            when(it) {
                3 -> "Pling"
                5 -> "Plang"
                7 -> "Plong"
                else -> ""
            }
        }.joinToString("").let { if(it.isEmpty()) n.toString() else it }
    }
}
