/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aula2poo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nonak
 */
public class CanetaTest {
    
    public CanetaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of status method, of class Caneta.
     */
    @Test
    public void testStatus() {
        System.out.println("status");
        Caneta instance = new Caneta();
        instance.status();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rabiscar method, of class Caneta.
     */
    @Test
    public void testRabiscar() {
        System.out.println("rabiscar");
        Caneta instance = new Caneta();
        instance.rabiscar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tampar method, of class Caneta.
     */
    @Test
    public void testTampar() {
        System.out.println("tampar");
        Caneta instance = new Caneta();
        instance.tampar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destampar method, of class Caneta.
     */
    @Test
    public void testDestampar() {
        System.out.println("destampar");
        Caneta instance = new Caneta();
        instance.destampar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
