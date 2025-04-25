package windows.events.keyboards

import events.*
import org.lwjgl.glfw.GLFW
import org.lwjgl.glfw.GLFWKeyCallback
import kotlin.reflect.KClass

class Keyboard(private val windowId: Long) : WEventEmitter {
    override val listeners = mutableMapOf<KClass<out Event<*, *>>, Listeners<out Event<*, *>, *, *>>()

    init {
        GLFW.glfwSetKeyCallback(windowId, object : GLFWKeyCallback() {
            override fun invoke(windowId: Long, key: Int, scancode: Int, action: Int, mods: Int) {
                when (action) {
                    GLFW.GLFW_PRESS -> {
                        emit(
                            KeyboardEvent.Pressed(
                                Key.fromKeyCode(key), mods
                            )
                        )
                    }
                    GLFW.GLFW_RELEASE -> {
                        emit(
                            KeyboardEvent.Released(
                                Key.fromKeyCode(key), mods
                            )
                        )
                    }
                    GLFW.GLFW_REPEAT -> {
                        emit(
                            KeyboardEvent.Repeated(
                                Key.fromKeyCode(key), mods
                            )
                        )
                    }
                }
            }
        })
    }

    fun isPressed(key: Key): Boolean {
        return GLFW.glfwGetKey(windowId, key.keyCode) == GLFW.GLFW_PRESS
    }
}