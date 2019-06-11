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
public class AdivinaMiNumero1Test {
    
    public AdivinaMiNumero1Test() {
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
     * Test of adivinar method, of class AdivinaMiNumero1.
     */
    @Test
    public void testAdivinar() {
        System.out.println("adivinar");
        int min = 0;
        int max = 100;
        int result = AdivinaMiNumero1.adivinar(min, max);
        if(result<min||result>max){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of jugar method, of class AdivinaMiNumero1.
     */
    @Test
    public void testJugar() {
        int Min = 0;
        int Max = 100;
        System.out.println("jugar");
        AdivinaMiNumero1 instance = new AdivinaMiNumero1();
        instance.respuesta="si";
        boolean expResult = true;
        boolean result = instance.Preguntar(Min,Max);
        instance.respuesta="si";
        instance.adivinarNumero(Min, Max);
        if(expResult!=result){
             fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Preguntar method, of class AdivinaMiNumero1.
     */
    @Test
    public void testPreguntar() {
        System.out.println("Preguntar");
        int Min = 0;
        int Max = 100;
        AdivinaMiNumero1 instance = new AdivinaMiNumero1();
        instance.respuesta="si";
        boolean expResult = true;
        boolean result = instance.Preguntar(Min, Max);
        if(expResult!=result){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of adivinarNumero method, of class AdivinaMiNumero1.
     */
    @Test
    public void testAdivinarNumero() {
        System.out.println("adivinarNumero");
        int min = 0;
        int max = 100;
        AdivinaMiNumero1 instance = new AdivinaMiNumero1();
        instance.respuesta="si";
        boolean expResult = true;
        boolean result = instance.adivinarNumero(min, max);
        if(expResult!=result){
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
    }
}
