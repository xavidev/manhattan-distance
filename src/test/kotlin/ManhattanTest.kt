import Point.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ManhattanTest {
    @Test
    fun `test initial case lo que sea`() {
        assertTrue { manhattanDistance(Point(1, 1), Point(1, 1)) == 0 }
    }

    private fun manhattanDistance(x: Point, y: Point): Int {
        return 0
    }
}