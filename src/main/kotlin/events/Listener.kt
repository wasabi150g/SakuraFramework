package events

import kotlin.reflect.KClass

class Listener<E : Event<C, R>, C, R>(val type: KClass<E>, val action: (E) -> R, vararg val conditions: C) {
    fun onReceived(event: E) {
        if (conditions.isEmpty()) {
            event.onResult(
                action.invoke(event)
            )
        } else {
            for (condition in conditions) {
                if (event.isMatched(condition)) {
                    event.onResult(
                        action.invoke(event)
                    )

                    return
                }
            }
        }
    }
}