/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.projetoalunosituacao;

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
public class AlunoTest {
    
    public AlunoTest() {
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
     * @since 04/03/2018
     * Teste na classe Aluno do metodo situação() quando o aluno tem baixa frequencia
     */
    @Test
    public void testSituacaoReprovadoPorFrequencia() {
        System.out.println("Situacao quando o aluno reprova por frequencia");
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(10,10,10,0,10);
        assertEquals(expResult, result);
        
    }
    /**
     * @since 04/03/2018
     * Teste na classe Aluno do metodo situação() quando o aluno passa direto com media maior que 7.0
     */
    @Test
    public void testSituacaoAprovadoDireto(){
        System.out.println("situacao quando o aluno é aprovado por media maior que 7");
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situacao(10.0,10.0,10.0,0.75,0);
        assertEquals(expResult, result);
        
    }
    /**
     * @since 04/03/2018
     * Teste na classe Aluno do metodo situação() quando o aluno reprova com media menor que 3.0
     */
    @Test
    public void testSituacaoReprovadoDireto(){
        System.out.println("situacao quando o aluno é reprovado por media menor que 3");
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(0,0,0,1.0,10.0);
        assertEquals(expResult, result);
        
    }
    /**
     * @since 04/03/2018
     * Teste na classe Aluno do metodo situação() quando o aluno passa na prova final
     */
    @Test
    public void testSituacaoAprovadoNaFinal(){
        System.out.println("situacao quando o aluno passa na prova final");
        Aluno instance = new Aluno();
        String expResult = "Aprovado";
        String result = instance.situacao(2,2,10.0,1.0,10.0);
        assertEquals(expResult, result);
        
    }
    /**
     * @since 04/03/2018
     * Teste na classe Aluno do metodo situação() quando o aluno reprova na prova final
     */
    @Test
    public void testSituacaoReprovadoNaFinal(){
        System.out.println("situacao quando o aluno reprova na prova final");
        Aluno instance = new Aluno();
        String expResult = "Reprovado";
        String result = instance.situacao(2,2,10.0,1.0,0.0);
        assertEquals(expResult, result);
        
    }

}
