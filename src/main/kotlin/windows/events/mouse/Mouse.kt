package windows.events.mouse

import events.*

import org.lwjgl.glfw.GLFW
import org.lwjgl.glfw.GLFWCursorPosCallback
import org.lwjgl.glfw.GLFWMouseButtonCallback
import org.lwjgl.system.MemoryStack
import kotlin.reflect.KClass

class Mouse(private val windowId: Long) : WEventEmitter {
    override val listeners = mutableMapOf<KClass<out Event<*, *>>, Listeners<out Event<*, *>, *, *>>()

    init {
        GLFW.glfwSetMouseButtonCallback(windowId, object : GLFWMouseButtonCallback() {
            override fun invoke(windowId: Long, button: Int, action: Int, mods: Int) {
                when (action) {
                    GLFW.GLFW_PRESS -> {
                        val position = getPosition()

                        emit(
                            MouseEvent.Pressed(
                                MouseButton.fromButtonId(button), position.first, position.second, mods
                            )
                        )
                    }
                    GLFW.GLFW_RELEASE -> {
                        val position = getPosition()

                        emit(
                            MouseEvent.Released(
                                MouseButton.fromButtonId(button), position.first, position.second, mods
                            )
                        )
                    }
                }
            }
        })

        GLFW.glfwSetCursorPosCallback(windowId, object : GLFWCursorPosCallback() {
            override fun invoke(windowId: Long, x: Double, y: Double) {
                emit(MouseEvent.Motion(x, y))
            }
        })
    }


    val x get() = getPosition().first
    val y get() = getPosition().second

    fun isPressed(button: MouseButton): Boolean {
        return GLFW.glfwGetMouseButton(windowId, button.buttonId) == GLFW.GLFW_PRESS
    }

    fun getPosition(): Pair<Double, Double> {
        MemoryStack.stackPush().use { stack ->
            val x = stack.mallocDouble(1)
            val y = stack.mallocDouble(1)

            GLFW.glfwGetCursorPos(windowId, x, y)
            return x[0] to y[0]
        }
    }
}