package Point

import java.lang.Math.abs

data class Point(private val x: Int, private val y: Int) {
    fun vector() = abs(x) + abs(y)
    operator fun plus(p2: Point): Int {

    }
}
