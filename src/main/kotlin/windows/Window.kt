package windows

import events.Listener
import events.on
import windows.events.keyboards.Keyboard
import windows.events.mouse.Mouse
import graphics.Context
import graphics.Matrix4D
import org.lwjgl.glfw.GLFW
import org.lwjgl.opengl.GL
import org.lwjgl.opengl.GL11
import org.lwjgl.system.MemoryUtil
import windows.events.component.Component
import windows.events.component.ComponentEvent

open class Window(title: String, width: Int, height: Int, visible: Boolean = true, resizable: Boolean = true) {
    internal val id: Long

    val keyboard: Keyboard

    val mouse: Mouse

    val component: Component

    var width: Int = 0
    var height: Int = 0

    constructor(width: Int, height: Int) : this("", width, height)

    init {
        GLFW.glfwDefaultWindowHints()
        GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, visible.toGLFW())
        GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, resizable.toGLFW())

        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3)
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 3)
        GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE)

        id = GLFW.glfwCreateWindow(width, height, title, MemoryUtil.NULL, MemoryUtil.NULL)

        GLFW.glfwMakeContextCurrent(id)

        GL.createCapabilities()

        GL11.glDisable(GL11.GL_DEPTH_TEST)

        keyboard = Keyboard(id)

        mouse = Mouse(id)

        component = Component(id)

        this.width = width
        this.height = height
        component.on(Listener(ComponentEvent.Resized::class, {
            this.width = it.width
            this.height = it.height
        }))
    }

    open fun init(context: Context) {

    }

    open fun main(context: Context) {

    }

    var title: String
        get() = GLFW.glfwGetWindowTitle(id)!!
        set(title) {
            GLFW.glfwSetWindowTitle(id, title)
        }
}