/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

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
public class ContaOrcamentoTest {
    
    public ContaOrcamentoTest() {
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
     * Test of getValorDisponivel method, of class ContaOrcamento quando da certo.
     */
    @Test
    public void testGetValorDisponivel() {
        System.out.println("Disponivel deu certo");
        ContaOrcamento instance = new ContaOrcamento();
        float expResult = 5;
        instance.setComprometido(5);
        instance.setOrcado(10);
        float result = instance.getValorDisponivel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of getValorDisponivel method, of class ContaOrcamento quando da errado.
     */
    @Test
    public void testGetValorDisponivelErrado() {
        System.out.println("Disponivel deu errado");
        ContaOrcamento instance = new ContaOrcamento();
        float expResult = 0.0F;
        instance.setComprometido(15);
        instance.setOrcado(10);
        float result = instance.getValorDisponivel();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    /**
     * Test of getValorRealizado method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorRealizado() {
        System.out.println("getValorRealizado");
        ContaOrcamento instance = new ContaOrcamento();
        float expResult = 0.0F;
        instance.setRealizado(0);
        float result = instance.getValorRealizado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getValorComprometido method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorComprometido() {
        System.out.println("getValorComprometido");
        ContaOrcamento instance = new ContaOrcamento();
        float expResult = 0.0F;
        instance.setComprometido(0);
        float result = instance.getValorComprometido();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getValorOrcado method, of class ContaOrcamento.
     */
    @Test
    public void testGetValorOrcado() {
        System.out.println("getValorOrcado");
        ContaOrcamento instance = new ContaOrcamento();
        float expResult = 0.0F;
        instance.setOrcado(0);
        float result = instance.getValorOrcado();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
