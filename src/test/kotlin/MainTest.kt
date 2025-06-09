// MainTest.kt
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun testAdd() {
        val result = add(10, 10)
        assertEquals(20, result)
    }
}
