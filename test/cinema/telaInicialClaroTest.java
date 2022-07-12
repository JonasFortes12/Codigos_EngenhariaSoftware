
package cinema;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonas
 */
public class telaInicialClaroTest {
    
    telaInicialClaro telaIniCl;
    
    @Before
    public void setUp() {
        telaIniCl = new telaInicialClaro();
    }

    @Test
    public void testTornarClaro() {
        assertTrue(telaIniCl.tornarClaro() instanceof telaInicialClaro);
    }

    @Test
    public void testTornarEscuro() {
        assertTrue(telaIniCl.tornarEscuro() instanceof telaInicialEscuro);
    }
    
}
