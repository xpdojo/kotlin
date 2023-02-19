package lang

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LoopTest {

    @Test
    fun while_loop() {
        var x = 1
        while (x <= 10) {
            x++
        }
        assert(x > 10)
    }

    @Test
    fun do_while_loop() {
        // Do while loop
        // The do-while loop is similar to while loop except that it
        // tests the condition at the end of the loop.
        // This means that it will at least execute the body once
        var z = 1
        do {
            print("$z ")
            z++
        } while (z <= 10)
        assert(z > 10)
    }

    @Test
    fun while_loop_with_break() {
        var feltTemp = "cold"
        var roomTemp = 10
        while (feltTemp == "cold") {
            roomTemp++
            if (roomTemp == 20) {
                feltTemp = "comfy"
            }
        }
        assertEquals(roomTemp, 20)
        assertEquals(feltTemp, "comfy")
    }

    @Test
    fun for_loop() {
        // For Loop
        // A for-loop is used to iterate through ranges, arrays, collections, or anything
        // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lecture).
        var result1 = ""
        for (num in 1..10) {
            result1 += "$num"
        }
        assertEquals(result1, "12345678910")

        // infix notation
        var result2 = ""
        for (i in 1 until 10) { // Same as - for(i in 1.until(10))
            result2 += "$i"
        }
        assertEquals(result2, "123456789")

        var result3 = ""
        for (i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
            result3 += "$i"
        }
        assertEquals(result3, "10987654321")

        var result4 = ""
        for (i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
            result4 += "$i"
        }
        assertEquals(result4, "13579")
    }

    @Test
    fun for_loop_with_break() {
        accumulator@ for (i in 1..10) {
            for (j in 1..10) {
                if (i - j == 5) {
                    assertEquals(i, 6)
                    assertEquals(j, 1)
                    break@accumulator
                }
            }
        }
    }

}
