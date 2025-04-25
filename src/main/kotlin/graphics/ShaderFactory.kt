package graphics

import ShaderProperties
import antlr4.WSLLexer
import antlr4.WSLParser
import openGL.GLProperty
import openGL.GLShader
import org.antlr.v4.runtime.*

class ShaderFactory(source: String) {
    companion object {
        fun fromResource(shaderName: String): ShaderFactory {
            return ShaderFactory(
                String(this::class.java.getResourceAsStream(shaderName)?.readAllBytes() ?: throw IllegalArgumentException("シェーダーが存在しません。"))
            )
        }
    }

    val version: String

    val sources = mutableMapOf<GLShader, String>()

    val layouts = mutableMapOf<String, GLProperty.Layout>()
    val uniforms = mutableMapOf<String, GLProperty.Uniform>()

    init {
        val charStream = CharStreams.fromString(source)

        val lexer = WSLLexer(charStream)
        lexer.removeErrorListeners()

        val parser = WSLParser(CommonTokenStream(lexer))
        parser.removeErrorListeners()

        val tree = parser.prog()

        if (tree.version().STRING() == null) {
            throw IllegalArgumentException("OpenGLのバージョンが指定されていません。")
        }

        version = tree.version().STRING().text

        val versionDirective = "#version $version core\n\n"

        val shaders = mutableListOf<Int>()

        if (tree.define_vert().size > 1) {
            throw IllegalArgumentException("定義されている頂点シェーダーが多すぎます。")
        }
        if (tree.define_vert().size == 1) {
            val vsource = tree.define_vert()[0].BLOCK().text.drop(1).dropLast(1).trimIndent()

            val properties = ShaderProperties(vsource)

            for (layout in properties.layouts) {
                layouts[layout.name] = layout
            }

            for (uniform in properties.uniforms) {
                uniforms[uniform.name] = uniform
            }

            sources[GLShader.VERTEX] = versionDirective + vsource
        }

        if (tree.define_frag().size > 1) {
            throw IllegalArgumentException("定義されているフラグメントシェーダーが多すぎます。")
        }
        if (tree.define_frag().size == 1) {
            val fsource = tree.define_frag()[0].BLOCK().text.drop(1).dropLast(1).trimIndent()

            val properties = ShaderProperties(fsource)

            for (layout in properties.layouts) {
                layouts[layout.name] = layout
            }

            for (uniform in properties.uniforms) {
                uniforms[uniform.name] = uniform
            }

            sources[GLShader.FRAGMENT] = versionDirective + fsource
        }
    }
}