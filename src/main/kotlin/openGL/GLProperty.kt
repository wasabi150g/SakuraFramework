package openGL

sealed class GLProperty(val type: GLType, val name: String) {
    class Layout(type: GLType, name: String, val location: Int) : GLProperty(type, name)

    class Uniform(type: GLType, name: String) : GLProperty(type, name)
}