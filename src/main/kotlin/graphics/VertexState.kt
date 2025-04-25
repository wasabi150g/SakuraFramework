package graphics

import org.lwjgl.opengl.GL11
import org.lwjgl.opengl.GL30
import org.lwjgl.system.MemoryUtil

class VertexState internal constructor(geometry: Geometry, val shader: Shader) {
    val vaoId = GL30.glGenVertexArrays()

    val eboCount = geometry.ebo.size

    init {
        GL30.glBindVertexArray(vaoId)

        val vboId = GL30.glGenBuffers()
        GL30.glBindBuffer(GL30.GL_ARRAY_BUFFER, vboId)
        val vertices = geometry.getVertices()
        val vertexBuffer = MemoryUtil.memAllocFloat(vertices.size).put(vertices).flip()
        GL30.glBufferData(GL30.GL_ARRAY_BUFFER, vertexBuffer, GL30.GL_STATIC_DRAW)

        val eboId = GL30.glGenBuffers()
        GL30.glBindBuffer(GL30.GL_ELEMENT_ARRAY_BUFFER, eboId)
        val indexBuffer = MemoryUtil.memAllocInt(geometry.ebo.size).put(geometry.ebo).flip()
        GL30.glBufferData(GL30.GL_ELEMENT_ARRAY_BUFFER, indexBuffer, GL30.GL_STATIC_DRAW)

        val stride = geometry.attributeTypes.sumOf { it.vector * Float.SIZE_BYTES }
        var pointer = 0L

        for (n in 0..<geometry.attributeTypes.size) {
            val index = shader.layouts[geometry.attributeNames[n]]?.location ?: throw IllegalStateException("${geometry.attributeNames[n]}はシェーダーに存在しない引数です。")

            println(geometry.attributeTypes[n].vector)
            GL30.glVertexAttribPointer(
                index, geometry.attributeTypes[n].vector, GL11.GL_FLOAT, false, stride, pointer
            )
            GL30.glEnableVertexAttribArray(index)

            pointer += Float.SIZE_BYTES * geometry.attributeTypes[n].vector
        }

        GL30.glBindVertexArray(0)

        MemoryUtil.memFree(vertexBuffer)
        MemoryUtil.memFree(indexBuffer)
    }
}