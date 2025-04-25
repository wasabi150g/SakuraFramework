package events

interface Event<C, R> {
    fun isMatched(condition: C): Boolean

    fun onResult(result: R) {

    }
}