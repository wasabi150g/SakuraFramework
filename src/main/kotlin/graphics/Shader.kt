package graphics

import openGL.GLProperty
import openGL.GLShader
import org.lwjgl.opengl.GL11
import org.lwjgl.opengl.GL20

class Shader internal constructor(
    sources: Map<GLShader, String>,

    val layouts: Map<String, GLProperty.Layout>,
    val uniforms: Map<String, GLProperty.Uniform>
) {
    val programId: Int

    init {
        val shaderIds = mutableListOf<Int>()

        for ((type, source) in sources) {
            val shaderId = GL20.glCreateShader(type.glShader)
            GL20.glShaderSource(shaderId, source)
            GL20.glCompileShader(shaderId)

            if (GL20.glGetShaderi(shaderId, GL20.GL_COMPILE_STATUS) == GL11.GL_FALSE) {
                val log = GL20.glGetShaderInfoLog(shaderId)
                throw IllegalArgumentException("${type.glShader}シェーダーのコンパイルに失敗しました。: $log")
            }

            shaderIds.add(shaderId)
        }

        programId = GL20.glCreateProgram()
        for (shaderId in shaderIds) {
            GL20.glAttachShader(programId, shaderId)
        }
        GL20.glLinkProgram(programId)

        if (GL20.glGetProgrami(programId, GL20.GL_LINK_STATUS) == GL11.GL_FALSE) {
            val log = GL20.glGetProgramInfoLog(programId)
            throw IllegalArgumentException("シェーダーのリンクに失敗しました。: $log")
        }

        for (shaderId in shaderIds) {
            GL20.glDeleteShader(shaderId)
        }
    }

    fun setUniform(name: String, value: Any) {
        GL20.glUseProgram(programId)

        (uniforms[name]?.type ?: throw IllegalArgumentException("${name}はシェーダーに存在しない引数です。")).setUniform(
            GL20.glGetUniformLocation(programId, name), value
        )

        GL20.glUseProgram(0)
    }
}