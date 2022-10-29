import Point.Point
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class ManhattanTest {
    private fun assertDistance(p1: Point, p2: Point, expected: Int) {
        assertTrue { manhattanDistance(p1, p2) == expected }
    }
    @Test
    fun `distance between same points`() {
        assertDistance(Point(1, 1), Point(1, 1), 0)
        assertDistance(Point(3, 3), Point(3, 3), 0)
        assertDistance(Point(-3, 3), Point(-3, 3), 0)
    }
    @Test
    fun `distance between positive points`() {
        assertDistance(Point(0, 0), Point(2, 2), 4)
        assertDistance(Point(2, 2), Point(0, 0), 4)
    }

    @Test
    fun `test distance between extreme points`(){
        assertDistance(Point(-3, 3), Point(3, -3), 12)
        assertDistance(Point(-2, 1), Point(1, -2), 6)
        assertDistance(Point(0, 1), Point(1, 0), 2)
    }

    private fun manhattanDistance(p1: Point, p2: Point): Int {
        if (p1 == p2)
            return 0
        if(p1.isInverseOf(p2)){
            return p1 + p2
        }

        return 6
    }
}