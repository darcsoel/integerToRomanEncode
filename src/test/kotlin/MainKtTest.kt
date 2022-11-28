import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MainKtTest {
    @Test
    fun testConvert3() {
        assertEquals("III", encode(3))
    }
    @Test
    fun testConvert4() {
        assertEquals("IV", encode(4))
    }
    @Test
    fun testConvert5() {
        assertEquals("V", encode(5))
    }
    @Test
    fun testConvert7() {
        assertEquals("VII", encode(7))
    }
    @Test
    fun testConvert8() {
        assertEquals("VIII", encode(7))
    }
    @Test
    fun testConvert9() {
        assertEquals("IX", encode(7))
    }
    @Test
    fun testConvert58() {
        assertEquals("LVIII", encode(58))
    }
    @Test
    fun testConvert90() {
        assertEquals("XC", encode(90))
    }
    @Test
    fun testConvert94() {
        assertEquals("XCIV", encode(94))
    }
    @Test
    fun testConvert1994() {
        assertEquals("MCMXCIV", encode(1994))
    }
}