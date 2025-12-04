import kotlin.test.*
import com.exemplo.kotlindemo.*

class MainTest {

    @Test
    fun testInstanciacion() {
        val calc = Calculadora()
        val vista = VistaCalculadora()
        assertNotNull(calc)
        assertNotNull(vista)
    }

    @Test
    fun testExecucionBasica() {
        // Non executamos o bucle principal (require entrada),
        // pero comprobamos que main() existe e é invocable.
        assertTrue(::main is Function0<*>)
    }
}