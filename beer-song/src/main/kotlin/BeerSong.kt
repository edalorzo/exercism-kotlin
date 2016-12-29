import java.text.MessageFormat

object BeerSong {

    private val SONG = "{0,choice,0#No more bottles|1#1 bottle|1<{0,number,integer} bottles} of beer on the wall, " +
            "{0,choice,0#no more bottles|1#1 bottle|1<{0,number,integer} bottles} of beer.\n" +
            "{0,choice,0#Go to the store and buy some more|1#Take it down and pass it around|1<Take one down and pass it around}, " +
            "{1,choice,-1#99 bottles|0#no more bottles|1#1 bottle|1<{1,number,integer} bottles} of beer on the wall.\n"

    private val form = MessageFormat(SONG);
    private val song: List<String> by lazy { (0..99).map { n -> form.format(arrayOf(n, n - 1)) } }

    val lyrics: String by lazy { song.reversed().joinToString("\n") }

    fun verse(n: Int): String {
        require(n >= 0 && n < 100)
        return verses(n, n)
    }

    fun verses(min: Int, max: Int): String {
        require(min >= 0 && min < 100)
        require(max >= 0 && max < 100)
        return if (min <= max) song.slice(min..max).joinToString("\n")
               else song.slice(max..min).reversed().joinToString("\n")
    }

}
