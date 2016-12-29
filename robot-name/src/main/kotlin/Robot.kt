import java.util.*

class Robot {

    var name = nextName()

    fun reset(): Unit {
        this.name = nextName()
    }

    private companion object {
        val letters = 'A'..'Z'
        val numbers = 0..9
        val allocated = mutableSetOf<String>()

        fun nextName(): String {
            var name: String
            do {
                name = generateName()
            } while (allocated.contains(name))
            return name
        }

        fun generateName()= "${letters.getRandom(2)}${numbers.getRandom(3)}"
    }
}

fun CharRange.getRandom(n: Int): String {
    val rand = Random()
    val size = this.count()
    return (1..n).map { "${ this.elementAt(rand.nextInt(size))}" }.joinToString("")
}

fun IntRange.getRandom(n: Int): String {
    val rand = Random()
    val size = this.count()
    return (1..n).map { "${ this.elementAt(rand.nextInt(size))}" }.joinToString("")
}
