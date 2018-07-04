/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.util.ArrayList;

/**
 * Classe Orcamento
 * 
 * @author Andre
 */
public class Orcamento extends PlanoConta{

    /**
     * @return the e
     */
    public Empresa getE() {
        return e;
    }

    /**
     * @param e the e to set
     */
    public void setE(Empresa e) {
        this.e = e;
    }

   
    private int ano;
    private ArrayList<ContaOrcamento> contaOrcamento;
    private Empresa e;
    
    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
     /**
     * @return the contaOrcamento
     */
    public ArrayList<ContaOrcamento> getContaOrcamento() {
        return contaOrcamento;
    }

    /**
     * @param contaOrcamento the contaOrcamento to set
     */
    public void setContaOrcamento(ArrayList<ContaOrcamento> contaOrcamento) {
        this.contaOrcamento = contaOrcamento;
    }

    
    
    
}
