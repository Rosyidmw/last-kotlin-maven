// MainTest.kt
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun testAdd() {
        val result = add(15, 10)
        assertEquals(25, result)
    }
}
