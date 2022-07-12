package cinema;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonas
 */
public class telaCadastroTest {
    
    telaCadastro telaC;
    
    @Before
    public void setUp() {
        telaCadastro telaC = telaCadastro.getInstancia();
    }
    
    @Test
    public void testGetInstancia() {
        
        assertTrue(telaC instanceof telaCadastro);
    }
    
}
