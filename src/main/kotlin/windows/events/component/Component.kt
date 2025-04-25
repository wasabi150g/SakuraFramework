package windows.events.component

import events.*
import org.lwjgl.glfw.*
import kotlin.reflect.KClass

class Component(private val windowId: Long) : WEventEmitter {
    override val listeners = mutableMapOf<KClass<out Event<*, *>>, Listeners<out Event<*, *>, *, *>>()

    init {
        GLFW.glfwSetWindowSizeCallback(windowId, object : GLFWWindowSizeCallback() {
            override fun invoke(window: Long, width: Int, height: Int) {
                emit(
                    ComponentEvent.Resized(width, height)
                )
            }
        })

        GLFW.glfwSetWindowPosCallback(windowId, object : GLFWWindowPosCallback() {
            override fun invoke(window: Long, posX: Int, posY: Int) {
                emit(
                    ComponentEvent.Moved(posX, posY)
                )
            }
        })
    }
}