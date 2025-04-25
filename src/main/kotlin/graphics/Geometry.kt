package graphics

import openGL.GLType
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

class Geometry(posName: String, vertices: FloatArray, val ebo: IntArray) {
    companion object {
        fun rect(posName: String, width: Float, height: Float): Geometry {
            return Geometry(
                posName,
                floatArrayOf(
                    0f   , 0f    , 0f,
                    width, 0f    , 0f,
                    width, height, 0f,
                    0f   , height, 0f,
                ),
                intArrayOf(
                    0, 1, 2,
                    0, 2, 3
                )
            )
        }

        fun poly(posName: String, count: Int, width: Float, height: Float): Geometry {
            return Geometry(
                posName,
                FloatArray(count * 3) {
                    when {
                        it % 3 == 0 -> {
                            (sin(PI * 2 / count * (it / 3)) * width / 2 + width / 2).toFloat()
                        }
                        it % 3 == 1 -> {
                            (cos(PI * 2 / count * (it / 3)) * height / 2 + height / 2).toFloat()
                        }
                        else -> 0f
                    }
                },
                IntArray(count * 3 - 6) {
                    when {
                        it % 3 == 1 -> {
                            it / 3 + 1
                        }
                        it % 3 == 2 -> {
                            it / 3 + 2
                        }
                        else -> 0
                    }
                }
            )
        }
    }

    val vertexCount: Int

    val vertices = mutableListOf<FloatArray>()

    val attributeNames = mutableListOf(posName)
    val attributeTypes = mutableListOf<GLType.Float>(GLType.Float.Vec3)

    init {
        if (vertices.size % 3 != 0) {
            throw IllegalArgumentException("頂点座標の長さが不足しています。")
        }

        vertexCount = vertices.size / 3

        this.vertices += vertices
    }

    fun assign(name: String, type: GLType.Float, attributes: FloatArray) {
        if (vertexCount * type.vector != attributes.size) {
            throw IllegalArgumentException("属性の長さが不正です。")
        }

        attributeTypes += type
        attributeNames += name

        vertices += attributes
    }

    fun move(dx: Float, dy: Float, dz: Float = 0f) {
        vertices[0] = vertices[0].mapIndexed { index, pos -> when(index % 3) {
            0 -> pos + dx
            1 -> pos + dy
            2 -> pos + dz
            else -> throw IllegalArgumentException("不明な余です。")
        } }.toFloatArray()
    }

    internal fun getVertices(): FloatArray {
        val vertices = mutableListOf<Float>()

        for (n in 0..<vertexCount) {
            for (m in 0..<this.vertices.size) {
                vertices += this.vertices[m].slice((n * attributeTypes[m].vector)..<((n + 1) * attributeTypes[m].vector))
            }
        }

        return vertices.toFloatArray()
    }
}