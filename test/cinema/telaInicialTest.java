/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *
 * @author jonas
 */


public class telaInicialTest {
    
    telaInicial tela;
   
    @Before
    public void setUp() throws Exception {
	tela = new telaInicial();
    }
    
    @Test
    public void testTelaInicial() {
        assertTrue(tela.estado instanceof telaInicialClaro);
        
    }

    @Test
    public void testTornarEscuro() {
       
        tela.tornarEscuro();
        assertTrue(tela.estado instanceof telaInicialEscuro);
        
    }
    @Test
    public void testTornarClaro() {
        
        tela.tornarClaro();
        assertTrue(tela.estado instanceof telaInicialClaro);
    }
    
}
