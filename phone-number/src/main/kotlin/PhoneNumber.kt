class PhoneNumber(val phone: String) {
    val number: String

    init {
        val digits = phone.filter { it.isDigit() }
        this.number = if(digits.length == 10) digits
        else if(digits.length == 11 && digits.first() == '1') digits.substring(1)
        else "0000000000"
    }

    val areaCode = number.substring(0..2)

    override fun toString() = "($areaCode) ${number.substring(3..5)}-${number.substring(6)}"
}
