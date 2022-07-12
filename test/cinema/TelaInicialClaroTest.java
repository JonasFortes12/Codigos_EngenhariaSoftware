
package cinema;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonas
 */
public class TelaInicialClaroTest {
    
    TelaInicialClaro telaIniCl;
    
    @Before
    public void setUp() {
        telaIniCl = new TelaInicialClaro();
    }

    @Test
    public void testTornarClaro() {
        assertTrue(telaIniCl.tornarClaro() instanceof TelaInicialClaro);
    }

    @Test
    public void testTornarEscuro() {
        assertTrue(telaIniCl.tornarEscuro() instanceof TelaInicialEscuro);
    }
    
}
