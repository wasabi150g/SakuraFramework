package windows.events.mouse

import org.lwjgl.glfw.GLFW

enum class MouseButton(val buttonId: Int) {
    BUTTON_UNKNOWN(-1),

    BUTTON_LEFT(GLFW.GLFW_MOUSE_BUTTON_LEFT),
    BUTTON_MIDDLE(GLFW.GLFW_MOUSE_BUTTON_MIDDLE),
    BUTTON_RIGHT(GLFW.GLFW_MOUSE_BUTTON_RIGHT);

    companion object {
        fun fromButtonId(buttonId: Int): MouseButton {
            return entries.find { it.buttonId == buttonId } ?: BUTTON_UNKNOWN
        }
    }
}