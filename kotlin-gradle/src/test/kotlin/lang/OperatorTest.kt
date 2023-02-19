package lang

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

/**
 * 연산자
 */
class OperatorTest {

    @Test
    @DisplayName("arithmetic")
    fun arithmetic() {
        // Arithmetic operators (+, -, *, /, %)
        var result = 5 + 3
        assertEquals(result, 8)

        result = result / 2
        assertEquals(result, 4)
        // alternatively
        result /= 2
        assertEquals(result, 2)

        result = result * 5
        assertEquals(result, 10)

        result = result - 1
        assertEquals(result, 9)

        var moduloResult = 5 % 2
        assertEquals(moduloResult, 1)
    }

    @Test
    @DisplayName("comparison")
    fun comparison() {
        // Comparison operators (==, !=, <, >, <=, >=)
        val isEqual = 5 == 3
        assertFalse(isEqual)

        val isNotEqual = 5 != 5
        assertFalse(isNotEqual)

        // Kotlin has a feature called String Interpolation.
        // This feature allows you to directly insert a template expression inside a String.
        // Template expressions are tiny pieces of code that are evaluated and
        // their results are concatenated with the original String.
        // A template expression is prefixed with $ symbol.
        // Following are examples of String interpolation
        println("isNotEqual is $isNotEqual")

        assertEquals("${5 > 3}", "true")
        assertEquals("${5 >= 3}", "true")
        assertEquals("${5 >= 5}", "true")

    }
    @Test
    @DisplayName("assignment")
    fun assignment() {
        // Assignment operators (+=, -=, *=, /=, %=)
        var myNum = 5
        myNum += 3
        assertEquals(myNum, 8)

        myNum *= 4
        assertEquals(myNum, 32)
    }

    @Test
    @DisplayName("increment and decrement")
    fun increment_decrement() {
        // ++, --
        var myNum: Short = 5
        myNum++
        assertEquals(myNum, 6)

        // increments after use
        assertEquals("${myNum++}", "6")

        // increments before use
        assertEquals("${++myNum}", "8")
        assertEquals("${--myNum}", "7")
    }

}
