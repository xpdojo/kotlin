package recursion

import org.junit.jupiter.api.Test

/**
 * Hanoi's Tower
 *
 * by GitHub Copilot
 * @see <a href="https://en.wikipedia.org/wiki/Tower_of_Hanoi">Tower of Hanoi</a>
 * @see <a href="https://www.youtube.com/watch?v=2SUvWfNJSsM">Video 1</a>
 * @see <a href="https://www.youtube.com/watch?v=5_6nsViVM00">Video 2</a>
 * @see <a href="https://www.youtube.com/watch?v=8lhxIOAfDss">Video 3</a>
 */
class HanoisTowerTest {

    @Test
    fun hanoi() {
        val hanoi = Hanoi(3)
        hanoi.move(3, 1, 3)
    }

    class Hanoi(private val n: Int) {
        private val tower = Array(3) { mutableListOf<Int>() }

        init {
            for (i in n downTo 1) {
                tower[0].add(i)
            }
        }

        fun move(n: Int, from: Int, to: Int) {
            if (n == 1) {
                println("Move disk $n from $from to $to")
                tower[to - 1].add(tower[from - 1].removeAt(tower[from - 1].size - 1))
                return
            }
            val other = 6 - from - to
            move(n - 1, from, other)
            println("Move disk $n from $from to $to")
            tower[to - 1].add(tower[from - 1].removeAt(tower[from - 1].size - 1))
            move(n - 1, other, to)
        }
    }
}
