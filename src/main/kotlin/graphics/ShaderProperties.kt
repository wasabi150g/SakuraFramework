import antlr4.GLSLLexer
import antlr4.GLSLParser
import openGL.GLProperty
import openGL.GLType
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class ShaderProperties(source: String) {
    val layouts = mutableListOf<GLProperty.Layout>()
    val uniforms = mutableListOf<GLProperty.Uniform>()

    init {
        val lexer = GLSLLexer(CharStreams.fromString(source))
        val parser = GLSLParser(CommonTokenStream(lexer))

        val tree = parser.prog()

        for (line in tree.line()) {
            if (line.layout() != null) {
                layouts.add(GLProperty.Layout(
                    GLType.fromName(line.layout().type().STRING().text),
                    line.layout().name().STRING().text,
                    Integer.parseInt(line.layout().location().STRING().text)
                ))
            }
            if (line.uniform() != null) {
                uniforms.add(GLProperty.Uniform(
                    GLType.fromName(line.uniform().type().STRING().text),
                    line.uniform().name().STRING().text
                ))
            }
        }
    }
}