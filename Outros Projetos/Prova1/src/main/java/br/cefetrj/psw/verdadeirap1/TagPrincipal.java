/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Classe da tag customizada
 * @author Andre
 */
public class TagPrincipal extends SimpleTagSupport{

    /**
     * @return the orcamento
     */
    public Orcamento getOrcamento() {
        return orcamento;
    }

    /**
     * @param orcamento the orcamento to set
     */
    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    private Orcamento orcamento;
    /**
     * Metodo que realiza uma tag de imprimir linha da tabela. 
     * @author André
     * @throws JspException exceção sobre as JSP
     * @throws IOException exceção sobre IO
     */
    
    @Override
    public void doTag() throws JspException, IOException {
        ArrayList<ContaOrcamento> co = getOrcamento().getContaOrcamento();
        getJspContext().getOut().print("<tr>");
        
        getJspContext().getOut().print("<td>");
        //Metodo Magico que imprime linha numa recursão
        for(ContaOrcamento c :co){
            imprime(c);
        }
        getJspContext().getOut().print("</td>");
        
        
        getJspContext().getOut().print("</tr>");
        
        
    }
    /**
     * 
     * @param c ContaOrcamento
     * @return a linha das informações da conta 
     */
    public String imprime(ContaOrcamento c){
        return c.toString();
    }
}