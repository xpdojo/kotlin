package lang

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class ConditionalTest {

    @Test
    fun if_else() {
        // Control Flows
        // If Statements
        val age = 17
        var can: String
        can = if (age >= 19) {
            "drink"
        } else if (age >= 16) {
            "drive"
        } else {
            "play"
        }

        assertEquals(can, "drive")
    }

    @Test
    fun when_expression() {
        // Kotlin’s "when" expression is the replacement of the switch statement
        // from other languages like C, C++, and Java.
        // It is compact and more powerful than switch statements.
        val index = 3
        var season: String =
            when (index) {
                1 -> "Spring"
                2 -> "Summer"
                3 -> "Fall"
                4 -> "Winter"
                else -> "Invalid Season"
            }
        assertEquals(season, "Fall")
    }

    @Test
    fun when_expression2() {
        val month = 3
        val season = when (month) {
            1, 2, 3 -> "Spring"
            in 4..6 -> "Summer"
            in 7..9 -> "Fall"
            in 10..12 -> "Winter"
            else -> "Invalid Season"
        }
        assertEquals(season, "Spring")
    }

    @Test
    fun when_expression3() {
        var x: Any = 13.37
        val message: String = when (x) {
            is Int -> "$x is an Int"
            !is Double -> "$x is not Double"
            is String -> "$x is a String"
            else -> "$x is none of the above"
        }
        assertIs<Double>(x)
        assertEquals(message, "$x is none of the above")
    }

}
