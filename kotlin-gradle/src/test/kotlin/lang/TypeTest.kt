package lang

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

/**
 * Primitive Types
 */
class TypeTest {

    @Test
    @DisplayName("var and val")
    fun variable_value() {
        // variable: can be reassigned (mutable)
        var b = 1
        b = 2
        assert(b == 2)

        // value: cannot be reassigned (immutable)
        val a = 1
        // a = 2
        assert(a == 1)
    }

    @Test
    @DisplayName("Integer Types")
    fun integer_size() {
        /**
         * Integer Types
         *
         * Byte: 8 bits
         * Short: 16 bits
         * Int: 32 bits
         * Long: 64 bits
         */
        val myByte: Byte = 1
        assertEquals(myByte, 1.toByte())

        val myShort: Short = 1
        assertEquals(myShort, 1.toShort())
        assertEquals((65535).toShort(), (-1).toShort())

        val myInt: Int = 1
        assertEquals(myInt, 1.toInt())

        val myLong: Long = 1L
        assertEquals(myLong, 1.toLong())
    }

    @Test
    @DisplayName("Floating Point Number Types")
    fun floating_point_number_size() {
        /**
         * Floating Point Number Types
         *
         * Float: 32 bits
         * Double: 64 bits
         */
        val myFloat: Float = 13.37F
        assertEquals(myFloat, (13.37).toFloat())

        val myDouble: Double = 3.1415926535897932384626433
        assertEquals(myDouble, (3.1415926535897932384626433).toDouble())
    }

    @Test
    @DisplayName("Boolean")
    fun boolean_size() {
        val myTrue: Boolean = true
        assertTrue(myTrue)

        val myFalse: Boolean = !myTrue
        assertFalse(myFalse)
    }

    @Test
    @DisplayName("Char")
    fun char() {
        val letterChar = 'A'
        assertNotEquals(letterChar, 'B')
    }

    @Test
    @DisplayName("String")
    fun string() {
        val myStr = "Hello World!"
        assertEquals(myStr[0], 'H')
    }

}
