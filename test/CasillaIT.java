/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author LUIS
 */
public class CasillaIT {
    
    public CasillaIT() {
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
     * Test of getPosFila method, of class Casilla.
     */
    @Test
    public void testGetPosFila() {
        System.out.println("getPosFila");
        Casilla instance = null;
        int expResult = 0;
        int result = instance.getPosFila();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPosFila method, of class Casilla.
     */
    @Test
    public void testSetPosFila() {
        System.out.println("setPosFila");
        int posFila = 0;
        Casilla instance = null;
        instance.setPosFila(posFila);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPosColumna method, of class Casilla.
     */
    @Test
    public void testGetPosColumna() {
        System.out.println("getPosColumna");
        Casilla instance = null;
        int expResult = 0;
        int result = instance.getPosColumna();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosColumna method, of class Casilla.
     */
    @Test
    public void testSetPosColumna() {
        System.out.println("setPosColumna");
        int posColumna = 0;
        Casilla instance = null;
        instance.setPosColumna(posColumna);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isMina method, of class Casilla.
     */
    @Test
    public void testIsMina() {
        System.out.println("isMina");
        Casilla instance = null;
        boolean expResult = false;
        boolean result = instance.isMina();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMina method, of class Casilla.
     */
    @Test
    public void testSetMina() {
        System.out.println("setMina");
        boolean mina = false;
        Casilla instance = null;
        instance.setMina(mina);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumMinasAlrededor method, of class Casilla.
     */
    @Test
    public void testGetNumMinasAlrededor() {
        System.out.println("getNumMinasAlrededor");
        Casilla instance = null;
        int expResult = 0;
        int result = instance.getNumMinasAlrededor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumMinasAlrededor method, of class Casilla.
     */
    @Test
    public void testSetNumMinasAlrededor() {
        System.out.println("setNumMinasAlrededor");
        int numMinasAlrededor = 0;
        Casilla instance = null;
        instance.setNumMinasAlrededor(numMinasAlrededor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of incrementarNumeroMinasAlrededor method, of class Casilla.
     */
    @Test
    public void testIncrementarNumeroMinasAlrededor() {
        System.out.println("incrementarNumeroMinasAlrededor");
        Casilla instance = null;
        instance.incrementarNumeroMinasAlrededor();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isAbierta method, of class Casilla.
     */
    @Test
    public void testIsAbierta() {
        System.out.println("isAbierta");
        Casilla instance = null;
        boolean expResult = false;
        boolean result = instance.isAbierta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAbierta method, of class Casilla.
     */
    @Test
    public void testSetAbierta() {
        System.out.println("setAbierta");
        boolean abierta = false;
        Casilla instance = null;
        instance.setAbierta(abierta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
