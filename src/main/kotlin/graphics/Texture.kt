package graphics

import openGL.GLImage
import org.lwjgl.opengl.GL11
import org.lwjgl.opengl.GL30

class Texture internal constructor(image: GLImage) {
    val id = GL11.glGenTextures()

    init {
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, id)

        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL11.GL_REPEAT)
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL11.GL_REPEAT)
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR_MIPMAP_LINEAR)
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR)

        GL11.glTexImage2D(
            GL11.GL_TEXTURE_2D,
            0,
            GL11.GL_RGBA,
            image.width,
            image.height,
            0,
            GL11.GL_RGBA,
            GL11.GL_UNSIGNED_BYTE,
            image.image
        )
        GL30.glGenerateMipmap(GL11.GL_TEXTURE_2D)

        image.cleanup()
    }
}