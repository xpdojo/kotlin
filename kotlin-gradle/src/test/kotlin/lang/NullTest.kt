package lang

import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertNull
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/**
 * Null Safety
 */
class NullTest {

    @Test
    @DisplayName("nullable val")
    fun nullable_val() {
        // Null can not be a value of a non-null type String
        // val str: String = null

        val str: String? = null
        assertEquals(str, null)
    }

    @Test
    @DisplayName("nullable var")
    fun nullable_var() {
        // Null can not be a value of a non-null type String
        // var str: String = null
        var str: String? = null
        assertEquals(str, null)
    }

    @Test
    fun nullable_function() {
        // NULLABLES/OPTIONALS in Kotlin
        // Kotlin supports nullability as part of its type System.
        // That means You have the ability to declare whether
        // a variable can hold a null value or not.
        // By supporting nullability in the type system,
        // the compiler can detect
        // possible NullPointerException errors at compile time
        // and reduce the possibility of having them thrown at runtime.
        var nullableName: String? = "Denis"
        nullableName = null // Works
        assertNull(nullableName)
    }

    @Test
    fun nullable_function2() {
        var name: String = "Denis"
        // name = null // Compilation Error

        // Here name cannot/must not be null
        val len = name.length
        assertEquals(len, 5)

        val upper = name.lowercase(Locale.getDefault())
        assertEquals(upper, "denis")
    }

    @Test
    fun nullable_function3() {
        // but the same methods won't work on nullable types
        // val len2 = nullableName.length // Compilation Error
        // val upper2 = nullableName.toLowerCase()  // Compilation Error

        // So how can we solve this? We could do a null check before hand

        val nullableName2: String? = "Denis"
        assertEquals(nullableName2, "Denis")

        if (nullableName2 != null) {
            println("Hello, ${nullableName2.lowercase(Locale.getDefault())}.")
            println("Your name is ${nullableName2.length} characters long.")
        } else {
            println("Hello, Guest")
        }

        // This works but seems to be quite some work...
        // So how about we shorten the syntax...
        // Kotlin provides a Safe call operator, ?.
        // It allows you to combine a null-check and
        // a method call in a single expression.

        val lowercase = nullableName2?.lowercase(Locale.getDefault())
        // This is the same as:
        if (nullableName2 != null)
            nullableName2.lowercase(Locale.getDefault())
        else
            null

        assertEquals(lowercase, "denis")
    }

    @Test
    fun nullable_function4() {
        // You can use methods on a nullable variable like this
        val nullableName3: String? = null

        assertNull(nullableName3?.lowercase(Locale.getDefault())) // prints null
        assertNull(nullableName3?.length) // prints null
    }

    @Test
    fun nullable_function5() {
        // You can perform a chain safe calls:
        // val wifesAge: String? = user?.wife?.age

        // Let's say we don’t want to print anything if
        // the variable is null?

        // In order to perform an operation only if the
        // variable is not null, we can use the safe call
        // operator with let -

        val nullableName4: String? = null

        nullableName4?.let { println(it.lowercase(Locale.getDefault())) }
        nullableName4?.let { println(it.length) }
        // Prints nothing because there nullableName is null
        // and we used let to prevent anything from being performed

        // What if we would like to enter a default value?
        // Then we can use the elvis operator ?:
        val name2 = nullableName4 ?: "Guest"
        assertEquals(name2, "Guest")

        // val은 non-null이기 때문에 null을 대입할 수 없다.
        // 하지만 nullable한 변수를 대입할 수 있다.
        // 이 경우에 elvis operator를 사용해서 기본값을 대입할 수 있다.
        // 머리 모양(?:)이 Elvis Presley의 머리 모양과 비슷해서 이름이 붙었다고 한다.

        // val wifesAge2: String? = user?.wife?.age ?: 0
    }

    @Test
    fun nullable_function6() {
        // Not null assertion : !! Operator
        // The !! operator converts a nullable type to a
        // non-null type, and throws a NullPointerException
        // if the nullable type holds a null value.
        // This is risky, and you should only use it if
        // you are 100% certain, that there will be a value in
        // the variable.
        val nullableName5: String? = null
        assertNull(nullableName5)
        assertThrows<NullPointerException> { nullableName5!!.lowercase(Locale.getDefault()) }
    }

}
