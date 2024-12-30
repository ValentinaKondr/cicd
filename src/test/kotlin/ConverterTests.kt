import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class ConverterTests {
    private val calculator = sf.Calculator()

    @Test
    fun test_add() {
       assertEquals(3, calculator.add(1, 2))
    }

    @Test
    fun test_subtract() {
       assertEquals(2, calculator.subtract(3, 1))
    }

    @Test
    fun test_multiply() {
        assertEquals(3, calculator.multiply(3, 2))
    }
}