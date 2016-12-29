object Strain {

    fun <T> keep(list: List<T>, check: (T) -> Boolean): List<T> {
        val found = mutableListOf<T>()
        for (item in list) {
            if (check(item)) {
                found.add(item)
            }
        }
        return found
    }

    fun <T> discard(list: List<T>, check: (T) -> Boolean) = keep(list, { !check(it) })


}
