/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class telaInicialTest {
    
    public telaInicialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tornarClaro method, of class telaInicial.
     */
    @Test
    public void testTornarClaro() {
        System.out.println("tornarClaro");
        telaInicial instance = new telaInicial();
        instance.tornarClaro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tornarEscuro method, of class telaInicial.
     */
    @Test
    public void testTornarEscuro() {
        System.out.println("tornarEscuro");
        telaInicial instance = new telaInicial();
        instance.tornarEscuro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
