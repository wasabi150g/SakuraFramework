package events

import kotlin.reflect.KClass

interface WEventEmitter {
    val listeners: MutableMap<KClass<out Event<*, *>>, Listeners<out Event<*, *>, *, *>>
}

@Suppress("UNCHECKED_CAST")
inline fun <reified E : Event<C, R>, reified C, reified  R> WEventEmitter.on(listener: Listener<E, C, R>) {
    (listeners.getOrPut(listener.type) {
        Listeners(listener.type)
    } as Listeners<E, C, R>).add(listener)
}

@Suppress("UNCHECKED_CAST")
inline fun <reified E : Event<C, R>, reified C, reified R> WEventEmitter.emit(event: E) {
    listeners[E::class]?.let { (it as Listeners<E, C, R>).onReceived(event) }
}