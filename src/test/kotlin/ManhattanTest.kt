import Point.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ManhattanTest {
    private fun assertDistance(p1: Point, p2: Point, expected: Int) {
        assertTrue { manhattanDistance(p1, p2) == expected }
    }
    @Test
    fun `test distance between positive points`() {
        assertDistance(Point(1, 1), Point(1, 1), 0)
        assertDistance(Point(2, 2), Point(4, 4), 4)
    }
    @Test
    fun `test distance between negative points`() {
        assertDistance(Point(-3, 3), Point(-3, 3), 0)
        assertDistance(Point(3, -3), Point(-3, 3), 12)
    }

    private fun manhattanDistance(p1: Point, p2: Point): Int {
        return p1 + p2
    }
}