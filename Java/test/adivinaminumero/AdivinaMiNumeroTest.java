/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaminumero;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matias
 */
public class AdivinaMiNumeroTest {
    
    public AdivinaMiNumeroTest() {
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
     * Test of mostrarIntroduccion method, of class AdivinaMiNumero.
     */
    @Test
    public void testMostrarIntroduccion() {
        System.out.println("mostrarIntroduccion");
        AdivinaMiNumero instance = new AdivinaMiNumero();
        boolean expResult = true;
        boolean result = instance.mostrarIntroduccion();
        if(!result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of jugar method, of class AdivinaMiNumero.
     */
    @Test
    public void testJugar() {
        System.out.println("jugar");
        AdivinaMiNumero instance = new AdivinaMiNumero();
        instance.numeroDesconocido= 10;
        instance.i=10;
        instance.j="Adivinaste";
        boolean expResult = true;
        boolean result = instance.jugar();
        if(!expResult||!result){
            fail("The test case is a prototype.");
        }       
    }

    /**
     * Test of solicitarNumero method, of class AdivinaMiNumero.
     * numero dentro de los rangos establecidos
     */
    @Test
    public void testSolicitarNumero() {
        System.out.println("solicitarNumero");
        AdivinaMiNumero instance = new AdivinaMiNumero();
        int result = (int) (Math.random() * 100);
        if(0<result&&result>100){
            fail("The test case is a prototype.");
        }
        
    }
    
    
}
