package graphics

import openGL.GLImage
import org.lwjgl.opengl.GL11
import org.lwjgl.opengl.GL20
import org.lwjgl.opengl.GL30

class Context internal constructor() {
    fun setClearColor(color: Color) {
        GL11.glClearColor(color.R, color.G, color.B, color.A)
    }

    fun clearColor() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT)
    }

    fun createShader(factory: ShaderFactory): Shader {
        return Shader(factory.sources, factory.layouts, factory.uniforms)
    }

    fun createVertexState(geometry: Geometry, shader: Shader): VertexState {
        return VertexState(geometry, shader)
    }

    fun createTexture(image: GLImage): Texture {
        return Texture(image)
    }

    fun draw(vertexState: VertexState) {
        GL20.glUseProgram(vertexState.shader.programId)

        GL30.glBindVertexArray(vertexState.vaoId)
        GL30.glDrawElements(GL20.GL_TRIANGLES, vertexState.eboCount, GL11.GL_UNSIGNED_INT, 0L)
    }
}