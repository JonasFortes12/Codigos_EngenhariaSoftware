package cinema;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonas
 */
public class AdaptadorValidadorTest {
   
    AdaptadorValidador validador;
    
    @Before
    public void setUp() {
        validador = new AdaptadorValidador();
    }
    
    @Test
    public void testValidadorAdaptadoReturnFalseBecauseEmail() {
        assertFalse(validador.validadorAdaptado("aaaa@aa@.com/g,mal", "12345", "12345"));
        
    }
    
    @Test
    public void testValidadorAdaptadoReturnFalseBecausePassword() {
        assertFalse(validador.validadorAdaptado("aaaaaa12@gmail.com", "12345", "02345"));
    }
    
    @Test
    public void testValidadorAdaptadoReturnTrue() {
        assertTrue(validador.validadorAdaptado("aaaaaa12@gmail.com", "12345", "12345"));
    }
    
}
