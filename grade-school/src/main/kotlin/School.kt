class School {

    val roster: MutableMap<Int, MutableList<String>> = mutableMapOf<Int, MutableList<String>>()

    fun add(name: String, grade: Int): Unit {
        val students = roster.getOrPut(grade) { mutableListOf() }
        if (!students.contains(name)) {
            students.add(name)
        }

        
    }

    fun sort(): Map<Int, List<String>> {
        return db().mapValues { entry -> entry.value.sorted() }
                .toSortedMap()
    }

    fun grade(grade: Int) = db().getOrElse(grade, { listOf() })
    fun db(): Map<Int, List<String>> = roster
}
