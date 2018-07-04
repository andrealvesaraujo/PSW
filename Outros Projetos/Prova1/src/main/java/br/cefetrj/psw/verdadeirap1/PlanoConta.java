/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.util.ArrayList;

/**
 * Classe PlanoConta
 * @author Andre
 */
public class PlanoConta {

    /**
     * @return the Conta
     */
    public ArrayList<Conta> getConta() {
        return Conta;
    }

    /**
     * @param Conta the Conta to set
     */
    public void setConta(ArrayList<Conta> Conta) {
        this.Conta = Conta;
    }

    
    private String nome;
    private ArrayList<Conta> Conta;
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
