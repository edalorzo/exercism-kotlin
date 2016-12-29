class Allergies(val score:Int) {

    fun isAllergicTo(allergen: Allergen) = (score or allergen.score) == score
    fun getList() = Allergen.values().filter { this.isAllergicTo(it) }

}
