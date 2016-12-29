class Squares(val n: Int) {

    fun squareOfSum() = (0..n).sum().let { sum -> sum * sum }
    fun sumOfSquares() = (0..n).sumBy { x -> x * x }
    fun difference() = squareOfSum() - sumOfSquares()

}
