/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

import com.mycompany.junit2.palindromo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Enrique
 */
public class palindromoTest {
    
    public palindromoTest() {
        System.out.println("NewEmptyJUnitTest");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass-setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass-tearDownClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("before-setUp");
    }
    
    @After
    public void tearDown() {
        System.out.println("after-tearDown");
    }
    
    
    @Test
    public void testGetPalindromo() {
        System.out.println("test: getNombreCompleto()");
        palindromo oPalindromo = new palindromo();
        assertNotNull("objeto palindromo creado",oPalindromo );
        assertEquals("getPalindromo: ana", oPalindromo.getPalindromo("ana"), "ana");
        assertTrue("getPalindromo: ana", "ana" == oPalindromo.getPalindromo("ana"));
        if ("ana" != oPalindromo.getPalindromo("ana")) {
            fail("getPalindromo: no es ana");
        }
        assertSame("prueba getReference", oPalindromo, oPalindromo.getReference());
        palindromo oCalculadora2 = new palindromo();
        assertNotSame("no son el mismo objeto", oPalindromo, oCalculadora2);
        
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}