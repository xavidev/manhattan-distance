import Point.Point
import kotlin.test.Test
import kotlin.test.assertTrue

class ManhattanTest {
    private fun assertDistance(p1: Point, p2: Point, expected: Int) {
        assertTrue { manhattanDistance(p1, p2) == expected }
    }

    @Test
    fun `test same point`(){
        assertDistance(Point(1,1), Point(1,1), 0)
    }


    private fun manhattanDistance(p1: Point, p2: Point): Int {
        if(p1 == p2)
            return 0

        return 999
    }
}