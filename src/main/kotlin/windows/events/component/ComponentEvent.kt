package windows.events.component

import events.Event

sealed class ComponentEvent : Event<Unit, Unit> {
    override fun isMatched(condition: Unit): Boolean {
        return true
    }

    class Resized(val width: Int, val height: Int) : ComponentEvent()

    class Moved(val posX: Int, val posY: Int) : ComponentEvent()
}