/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecadet.coursjenkins;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Edward Cadet
 */
public class FonctionMathTest {
    
    public FonctionMathTest() {
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
     * Test of add method, of class FonctionMath.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String valeur1 = "5";
        String valeur2 = "7";
        int expResult = 12;
        int result = FonctionMath.add(valeur1, valeur2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add 2");
        String valeur1 = "a5";
        String valeur2 = "7";
        
        assertThrows(NumberFormatException.class,() -> {
                                        FonctionMath.add(valeur1, valeur2);
                                    });
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of minus method, of class FonctionMath.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        String valeur1 = "5";
        String valeur2 = "7";
        int expResult = -2;
        int result = FonctionMath.minus(valeur1, valeur2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of divide method, of class FonctionMath.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        String valeur1 = "5";
        String valeur2 = "2";
        double expResult = 2.5;
        double result = FonctionMath.divide(valeur1, valeur2);
        assertEquals(expResult, result, .5);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
}
