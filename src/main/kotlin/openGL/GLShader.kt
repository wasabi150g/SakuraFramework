package openGL

import org.lwjgl.opengl.GL20

enum class GLShader(val glShader: Int) {
    VERTEX(GL20.GL_VERTEX_SHADER),
    FRAGMENT(GL20.GL_FRAGMENT_SHADER)
}