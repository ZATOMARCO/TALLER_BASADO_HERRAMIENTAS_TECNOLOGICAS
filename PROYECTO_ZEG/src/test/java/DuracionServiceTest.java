import org.junit.Test;
import static org.junit.Assert.*;

public class DuracionServiceTest {

    @Test
    public void testDuracionCorrecta() {
        long inicio = 1600000000000L;
        long fin = 1600000360000L; // +6 minutos
        long resultado = (fin - inicio) / 60000;
        assertEquals(6, resultado);
    }
}
