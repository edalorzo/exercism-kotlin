import java.time.LocalDate
import java.time.LocalTime
import java.time.LocalDateTime

class Gigasecond(private val dateOfBirth: LocalDateTime){
	
	val date = dateOfBirth.plusSeconds(1000000000L)

	constructor(dateOfBirth: LocalDate): this(dateOfBirth.atTime(LocalTime.MIDNIGHT))
}