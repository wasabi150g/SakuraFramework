package openGL

import org.lwjgl.stb.STBImage
import org.lwjgl.system.MemoryStack.stackPush
import java.nio.ByteBuffer


class GLImage(imagePath: String) {
    companion object {
        fun fromResource(imageName: String): GLImage {
            return GLImage(this::class.java.getResource(imageName)?.path ?: throw IllegalArgumentException("画像が存在しません。"))
        }
    }

    val width: Int
    val height: Int

    val image: ByteBuffer

    init {
        stackPush().use { stack ->
            val w = stack.mallocInt(1)
            val h = stack.mallocInt(1)
            val comp = stack.mallocInt(1)

            STBImage.stbi_set_flip_vertically_on_load(true)
            image = STBImage.stbi_load(imagePath, w, h, comp, 4) ?: throw IllegalArgumentException("画像の読み込みに失敗しました。")

            width = w.get()
            height = h.get()
        }
    }

    fun cleanup() {
        STBImage.stbi_image_free(image)
    }
}