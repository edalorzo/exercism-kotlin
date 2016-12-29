import SpaceAge.Planet.*;

class SpaceAge(val seconds: Long) {

    enum class Planet(val seconds: Double) {
        MERCURY(0.2408467 * 31557600.0),
        VENUS(0.61519726 * 31557600.0),
        EARTH(31557600.0),
        MARS(1.8808158 * 31557600.0),
        JUPITER(11.862615 * 31557600.0),
        SATURN(29.447498 * 31557600.0),
        URANUS(84.016846 * 31557600.0),
        NEPTUNE(164.79132 * 31557600.0);

        fun getEarthYears(seconds: Long) = Math.round((seconds / this.seconds) * 100.0) / 100.0
    }

    fun onMercury() = MERCURY.getEarthYears(seconds)
    fun onVenus() = VENUS.getEarthYears(seconds)
    fun onEarth() = EARTH.getEarthYears(seconds)
    fun onMars() = MARS.getEarthYears(seconds)
    fun onJupiter() = JUPITER.getEarthYears(seconds)
    fun onSaturn() = SATURN.getEarthYears(seconds)
    fun onUranus() = URANUS.getEarthYears(seconds)
    fun onNeptune() = NEPTUNE.getEarthYears(seconds)


}
