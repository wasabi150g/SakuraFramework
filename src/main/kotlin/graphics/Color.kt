package graphics

data class Color(val R: Float, val G: Float, val B: Float, val A: Float = 1f) {
    companion object {
        val DEFAULT = Color(0f, 0f, 0f)

        val WHITE = Color(1f, 1f, 1f)

        val RED = Color(1f, 0f, 0f)
        val GREEN = Color(0f, 1f, 0f)
        val BLUE = Color(0f, 0f, 1f)

        val YELLOW = Color(1f, 1f, 0f)
        val CYAN = Color(0f, 1f, 1f)
        val MAGENTA = Color(1f, 0f, 1f)

        fun decode(hex: String): Color {
            val color = Integer.decode(hex)

            return Color((color shr 16) / 0xFF.toFloat(), (color shr 8 and 0xFF) / 0xFF.toFloat(), (color and 0xFF) / 0xFF.toFloat())
        }
    }

    fun toFloatArray(): FloatArray {
        return floatArrayOf(R, G, B, A)
    }
}