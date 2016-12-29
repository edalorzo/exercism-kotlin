object ETL {

	fun transform(data: Map<Int, List<String>>) : Map<String,Int> {
        return data.flatMap {
            it.value.map { word -> word.toLowerCase() to it.key}
        }.toMap()
	}

}
