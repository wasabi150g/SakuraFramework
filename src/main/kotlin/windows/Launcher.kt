package windows

import graphics.Context
import org.lwjgl.glfw.GLFW

object Launcher {
    init {
        if (!GLFW.glfwInit()) {
            throw IllegalStateException("GLFWの初期化に失敗しました")
        }

        GLFW.glfwSwapInterval(1)
    }

    var defaultFPS = 30

    var lastFPS = 0

    var frameNow = 0

    fun launch(vararg windows: Window, targetFPS: Int = defaultFPS) {
        frameNow = 0

        for (window in windows) {
            GLFW.glfwMakeContextCurrent(window.id)

            window.init(Context())
        }

        val activeWindows = mutableListOf(*windows)

        while (activeWindows.isNotEmpty()) {
            val lastTime = System.nanoTime()

            var fpsCount = 0

            while (System.nanoTime() - lastTime < 1_000_000_000 && activeWindows.isNotEmpty()) {
                val frameTime = System.nanoTime()

                val iterator = activeWindows.iterator()

                while (iterator.hasNext()) {
                    val activeWindow = iterator.next()

                    GLFW.glfwMakeContextCurrent(activeWindow.id)

                    activeWindow.main(Context())

                    GLFW.glfwSwapBuffers(activeWindow.id)

                    if (GLFW.glfwWindowShouldClose(activeWindow.id)) {
                        GLFW.glfwDestroyWindow(activeWindow.id)

                        iterator.remove()
                    }
                }

                GLFW.glfwPollEvents()

                if (System.nanoTime() - frameTime < 1_000_000_000 / targetFPS) {
                    Thread.sleep((1_000_000_000 / targetFPS - System.nanoTime() + frameTime) / 1_000_000)
                }

                fpsCount++
                frameNow++
            }

            lastFPS = fpsCount
        }

        GLFW.glfwTerminate()
    }
}

internal fun Boolean.toGLFW(): Int {
    if (this) {
        return GLFW.GLFW_TRUE
    }
    return GLFW.GLFW_FALSE
}