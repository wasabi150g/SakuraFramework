package graphics

import com.jogamp.opengl.math.Matrix4f
import com.jogamp.opengl.math.Vec3f

class Matrix4D {
    companion object {
        fun ortho(left: Float, right: Float, bottom: Float, top: Float, near: Float = -1f, far: Float = 1f): Matrix4D {
            return Matrix4D().also { it.matrix.setToOrtho(left, right, bottom, top, near, far) }
        }

        fun lookAt(cx: Float, cy: Float, cz: Float, tx: Float, ty: Float, tz: Float, ux: Float, uy: Float, uz: Float): Matrix4D {
            return Matrix4D().also {
                it.matrix.setToLookAt(Vec3f(cx, cy, cz), Vec3f(tx, ty, tz), Vec3f(ux, uy, uz), Matrix4f())
            }
        }

        fun translate(dx: Float, dy: Float, dz: Float = 0f): Matrix4D {
            return Matrix4D().also { it.matrix.translate(dx, dy, dz, Matrix4f()) }
        }
        fun rotate(a: Float, dx: Float, dy: Float, dz: Float): Matrix4D {
            return Matrix4D().also { it.matrix.rotate(a, dx, dy, dz, Matrix4f()) }
        }
        fun scale(dx: Float, dy: Float, dz: Float = 0f): Matrix4D {
            return Matrix4D().also { it.matrix.setToScale(dx, dy, dz) }
        }
    }

    var matrix = Matrix4f()

    fun translate(dx: Float, dy: Float, dz: Float): Matrix4D {
        matrix.translate(dx, dy, dz, Matrix4f())

        return this
    }
    fun rotate(a: Float, dx: Float, dy: Float, dz: Float): Matrix4D {
        matrix.rotate(a, dx, dy, dz, Matrix4f())

        return this
    }
    fun scale(dx: Float, dy: Float, dz: Float): Matrix4D {
        matrix.setToScale(dx, dy, dz)

        return this
    }
}