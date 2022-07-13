package cinema;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonas
 */
public class TelaCadastroTest {
    
    TelaCadastro telaC;
    TelaCadastro telaCAux;
    
    @Before
    public void setUp() {
        telaC = null;
    }
    
    @Test
    public void testGetInstancia() {
        TelaCadastro telaC = TelaCadastro.getInstancia();
        assertTrue(telaC instanceof TelaCadastro);
    }
    
    @Test
    public void testGetInstanciaAfterFirstInstance() {
        telaC = TelaCadastro.getInstancia();
        telaCAux = TelaCadastro.getInstancia();
        
        assertTrue(telaC == telaCAux);
    }
    
    
    
}
