import Point.Point
import kotlin.test.assertTrue

class ManhattanTest {
    private fun assertDistance(p1: Point, p2: Point, expected: Int) {
        assertTrue { manhattanDistance(p1, p2) == expected }
    }


    private fun manhattanDistance(p1: Point, p2: Point): Int {
        return 0
    }
}