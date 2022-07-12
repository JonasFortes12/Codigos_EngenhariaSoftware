package cinema;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonas
 */
public class TelaCadastroTest {
    
    TelaCadastro telaC;
    
    @Before
    public void setUp() {
        TelaCadastro telaC = TelaCadastro.getInstancia();
    }
    
    @Test
    public void testGetInstancia() {
        
        assertTrue(telaC instanceof TelaCadastro);
    }
    
}
