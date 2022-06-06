/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.List;
import java.util.function.Consumer;
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
public class TableroIT {
    
    public TableroIT() {
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
     * Test of inicializarCasillas method, of class Tablero.
     */
    @Test
    public void testInicializarCasillas() {
        System.out.println("inicializarCasillas");
        Tablero instance = null;
        instance.inicializarCasillas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of imprimirTablero method, of class Tablero.
     */
    @Test
    public void testImprimirTablero() {
        System.out.println("imprimirTablero");
        Tablero instance = null;
        instance.imprimirTablero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCasillasConMinas method, of class Tablero.
     */
    @Test
    public void testObtenerCasillasConMinas() {
        System.out.println("obtenerCasillasConMinas");
        Tablero instance = null;
        List<Casilla> expResult = null;
        List<Casilla> result = instance.obtenerCasillasConMinas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarCasilla method, of class Tablero.
     */
    @Test
    public void testSeleccionarCasilla() {
        System.out.println("seleccionarCasilla");
        int posFila = 0;
        int posColumna = 0;
        Tablero instance = null;
        instance.seleccionarCasilla(posFila, posColumna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marcarCasillaAbierta method, of class Tablero.
     */
    @Test
    public void testMarcarCasillaAbierta() {
        System.out.println("marcarCasillaAbierta");
        int posFila = 0;
        int posColumna = 0;
        Tablero instance = null;
        instance.marcarCasillaAbierta(posFila, posColumna);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of partidaGanada method, of class Tablero.
     */
    @Test
    public void testPartidaGanada() {
        System.out.println("partidaGanada");
        Tablero instance = null;
        boolean expResult = false;
        boolean result = instance.partidaGanada();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Tablero.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Tablero.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventoPartidaPerdida method, of class Tablero.
     */
    @Test
    public void testSetEventoPartidaPerdida() {
        System.out.println("setEventoPartidaPerdida");
        Consumer<List<Casilla>> eventoPartidaPerdida = null;
        Tablero instance = null;
        instance.setEventoPartidaPerdida(eventoPartidaPerdida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventoCasillaAbierta method, of class Tablero.
     */
    @Test
    public void testSetEventoCasillaAbierta() {
        System.out.println("setEventoCasillaAbierta");
        Consumer<Casilla> eventoCasilaAbierta = null;
        Tablero instance = null;
        instance.setEventoCasillaAbierta(eventoCasilaAbierta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEventoPartidaGanada method, of class Tablero.
     */
    @Test
    public void testSetEventoPartidaGanada() {
        System.out.println("setEventoPartidaGanada");
        Consumer<List<Casilla>> eventoPartidaGanada = null;
        Tablero instance = null;
        instance.setEventoPartidaGanada(eventoPartidaGanada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
