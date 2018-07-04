/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.util.ArrayList;

/**
  Classe Empresa
 * @author Andre
 */
public class Empresa {

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

    /**
     * @return the planos
     */
    public ArrayList<PlanoConta> getPlanos() {
        return planos;
    }

    /**
     * @param planos the planos to set
     */
    public void setPlanos(ArrayList<PlanoConta> planos) {
        this.planos = planos;
    }
    private String nome;
    private ArrayList<PlanoConta> planos;
    
}
