object Accumulate {

    fun <T,R> accumulate(source: List<T>, transform: (T) -> R) : List<R> {
        return mapTo(source, mutableListOf(), transform)
    }

    private inline fun <T, R, C : MutableCollection<in R>> mapTo(source: List<T>, destination: C, transform: (T) -> R): C {
        for (item in source)
            destination.add(transform(item))
        return destination
    }
}
