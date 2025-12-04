import kotlin.test.*
import com.exemplo.kotlindemo.*

class CalculadoraTest {

    private val calc = Calculadora()

    @Test
    fun testSumar() {
        assertEquals(5.0, calc.sumar(2.0, 3.0))
    }

    @Test
    fun testRestar() {
        assertEquals(1.0, calc.restar(4.0, 3.0))
    }

    @Test
    fun testMultiplicar() {
        assertEquals(12.0, calc.multiplicar(3.0, 4.0))
    }

    @Test
    fun testDividir() {
        assertEquals(2.0, calc.dividir(10.0, 5.0))
    }

    @Test
    fun testDividirPorCero() {
        val ex = assertFailsWith<IllegalArgumentException> {
            calc.dividir(10.0, 0.0)
        }
        assertEquals("Non se pode dividir entre cero", ex.message)
    }
}
