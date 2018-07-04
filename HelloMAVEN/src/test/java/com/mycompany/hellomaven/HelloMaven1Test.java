/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hellomaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andre
 */
public class HelloMaven1Test {
    
    public HelloMaven1Test() {
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
     * Test of helloMavenMsg method, of class HelloMaven1 com parametro igual a  false.
     */
    @org.junit.Test
    public void testHelloMavenMsg() {
        System.out.println("testHelloMavenMsg");
        HelloMaven1 instance = new HelloMaven1();
        String expResult = "Hello";
        String result = instance.helloMavenMsg("false");
        assertEquals(expResult, result);
        
    }
    /**
     * 
     * Test of helloMavenMsg method, of class HelloMaven1 com parametro igual a  true.
     * 
     */
    @org.junit.Test
    public void testHello() {
        System.out.println("testHello");
        HelloMaven1 instance = new HelloMaven1();
        String expResult = "Hello Maven";
        String result = instance.helloMavenMsg("true");
        assertEquals(expResult, result);
        
        
    }
    
    /**
     * 
     * Test of helloMavenMsg method, of class HelloMaven1 com parametro igual a invalido.
     * 
     */
    @org.junit.Test
    public void testHelloParametroInvalido() {
        System.out.println("testHelloParametroInvalido");
        HelloMaven1 instance = new HelloMaven1();
        String expResult = "Erro";
        String result = instance.helloMavenMsg("invalido");
        assertEquals(expResult, result);
        
        
    }
    
}
