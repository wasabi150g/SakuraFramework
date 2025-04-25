package openGL

import graphics.Color
import graphics.Matrix4D
import graphics.Texture
import org.lwjgl.opengl.GL20

sealed class GLType(val glName: String) {
    companion object {
        fun fromName(name: String): GLType {
            val types = listOf(
                Float.Vec1, Float.Vec2, Float.Vec3, Float.Vec4,
                Matrix.Vec2, Matrix.Vec3, Matrix.Vec4, Texture2D
            )

            for (type in types) {
                if (type.glName == name) {
                    return type
                }
            }

            throw IllegalArgumentException("$name は不明な型です。")
        }
    }

    abstract fun setUniform(location: kotlin.Int, value: Any)

    sealed class Int(glName: String) : GLType(glName) {
        override fun setUniform(location: kotlin.Int, value: Any) {
            if (value !is IntArray) {
                throw IllegalArgumentException("その型には対応していません。必要: IntArray")
            }
        }

        data object Vec1 : Int("int") {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniform1i(location, (value as IntArray)[0])
            }
        }
        data object Vec2 : Int("ivec2") {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniform2i(location, (value as IntArray)[0], value[1])
            }
        }
        data object Vec3 : Int("ivec3") {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniform3i(location, (value as IntArray)[0], value[1], value[2])
            }
        }
        data object Vec4 : Int("ivec4") {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniform4i(location, (value as IntArray)[0], value[1], value[3], value[4])
            }
        }
    }

    sealed class Float(glName: String, val vector: kotlin.Int) : GLType(glName) {
        override fun setUniform(location: kotlin.Int, value: Any) {
            if (value !is FloatArray) {
                throw IllegalArgumentException("その型には対応していません。必要: FloatArray")
            }
        }

        data object Vec1 : Float("float", 1) {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniform1f(location, (value as FloatArray)[0])
            }
        }
        data object Vec2 : Float("vec2", 2) {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniform2f(location, (value as FloatArray)[0], value[1])
            }
        }
        data object Vec3 : Float("vec3", 3) {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniform3f(location, (value as FloatArray)[0], value[1], value[2])
            }
        }
        data object Vec4 : Float("vec4", 4) {
            override fun setUniform(location: kotlin.Int, value: Any) {
                when (value) {
                    is FloatArray -> {
                        GL20.glUniform4f(location, value[0], value[1], value[2], value[3])
                    }
                    is Color -> {
                        GL20.glUniform4f(location, value.R, value.G, value.B, value.A)
                    }
                    else -> {
                        throw IllegalArgumentException("その型には対応していません。必要: FloatArray or Color")
                    }
                }
            }
        }
    }

    sealed class Matrix(glName: String) : GLType(glName) {
        override fun setUniform(location: kotlin.Int, value: Any) {
            if (value !is FloatArray) {
                throw IllegalArgumentException("その型には対応していません。必要: FloatArray")
            }
        }

        data object Vec2 : Matrix("mat2") {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniformMatrix2fv(location, false, (value as FloatArray))
            }
        }
        data object Vec3 : Matrix("mat3") {
            override fun setUniform(location: kotlin.Int, value: Any) {
                super.setUniform(location, value)

                GL20.glUniformMatrix3fv(location, false, (value as FloatArray))
            }
        }
        data object Vec4 : Matrix("mat4") {
            override fun setUniform(location: kotlin.Int, value: Any) {
                when (value) {
                    is FloatArray -> {
                        GL20.glUniformMatrix4fv(location, false, value)
                    }
                    is Matrix4D -> {
                        GL20.glUniformMatrix4fv(location, false, FloatArray(16) { value.matrix[it] })
                    }
                    else -> {
                        throw IllegalArgumentException("その型には対応していません。必要: FloatArray or Matrix4D")
                    }
                }
            }
        }
    }

    data object Texture2D : GLType("sampler2D") {
        override fun setUniform(location: kotlin.Int, value: Any) {
            if (value !is Texture) {
                throw IllegalArgumentException("その型には対応していません。必要: Texture")
            }

            GL20.glActiveTexture(GL20.GL_TEXTURE0)
            GL20.glBindTexture(GL20.GL_TEXTURE_2D, value.id)

            GL20.glUniform1i(location, 0)
        }
    }
}