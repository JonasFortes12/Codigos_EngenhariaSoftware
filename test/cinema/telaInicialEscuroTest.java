/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jonas
 */
public class telaInicialEscuroTest {
      
    telaInicialClaro telaIniCl;
    
    @Before
    public void setUp() {
        telaIniCl = new telaInicialClaro();
    }

    @Test
    public void testTornarEscuro() {
        assertTrue(telaIniCl.tornarEscuro() instanceof telaInicialEscuro);
    }

    @Test
    public void testTornarClaro() {
        assertTrue(telaIniCl.tornarClaro() instanceof telaInicialClaro);
    }
    
}
