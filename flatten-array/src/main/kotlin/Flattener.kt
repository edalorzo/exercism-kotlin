object Flattener {

    fun flatten(list: List<Any?>): List<Any> {
        return list.filter { it != null  }.flatMap {
            when {
                it is List<*> -> flatten(it)
                it != null -> listOf(it)
                else -> listOf()
            }
        }
    }


}
