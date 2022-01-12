/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SepehrSafa
 */
public class CircuitTest {
    private static Circuit circuit;
    public CircuitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        circuit = Circuit.getInstance();
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
     * Test of getInstance method, of class Circuit.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        assertTrue(circuit instanceof Circuit);
    }

    /**
     * Test of add method, of class Circuit.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        CircuitComponent r = new Resistor(2.0,firstNode,secondNode);;
        circuit.add(r);
        assertEquals(1,circuit.numberOfComponents());

    }

    /**
     * Test of toString method, of class Circuit.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "R1 1 2 2.0\n";
        String result = circuit.toString();
        assertEquals(expResult, result);
    }
    
}
