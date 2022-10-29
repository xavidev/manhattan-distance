package Point

import java.lang.Math.abs

data class Point(private val x: Int, private val y: Int) {
    fun isInverseOf(p2: Point): Boolean = swap() == p2

    private fun swap(): Point = copy(x = y, y = x)
    operator fun plus(p2: Point): Int {
        return abs(x) * 2 + abs(y) * 2
    }
}
