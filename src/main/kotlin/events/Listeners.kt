package events

import kotlin.reflect.KClass

class Listeners<E : Event<C, R>, C, R>(private val type: KClass<E>) {
    private val listeners = mutableListOf<Listener<E, C, R>>()

    fun add(listener: Listener<E, C, R>) {
        listeners.add(listener)
    }

    fun onReceived(event: E) {
        for (listener in listeners) {
            listener.onReceived(event)
        }
    }
}