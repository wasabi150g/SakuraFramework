package windows.events.mouse

import events.Event

sealed class MouseEvent(val status: MouseButtonStatus, val button: MouseButton, val x: Double, val y: Double, val mods: Int) : Event<MouseButton, Unit> {
    override fun isMatched(condition: MouseButton): Boolean {
        return condition == button
    }

    class Pressed(button: MouseButton, x: Double, y: Double, mods: Int) : MouseEvent(MouseButtonStatus.BUTTON_PRESSED, button, x, y, mods)

    class Released(button: MouseButton, x: Double, y: Double, mods: Int) : MouseEvent(
        MouseButtonStatus.BUTTON_RELEASED, button, x, y, mods)

    class Motion(val x: Double, val y: Double): Event<Unit, Unit> {
        override fun isMatched(condition: Unit): Boolean {
            return true
        }
    }
}