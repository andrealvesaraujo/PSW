/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.util.ArrayList;

/**
 * Classe Conta
 * @author Andre
 */
//Lembrar da subconta
public class Conta  {

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
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the subcontas
     */
    public ArrayList<Conta> getSubcontas() {
        return subcontas;
    }

    /**
     * @param subcontas the subcontas to set
     */
    public void setSubcontas(ArrayList<Conta> subcontas) {
        this.subcontas = subcontas;
    }
    private String nome;
    private int codigo;
    private ArrayList<Conta> subcontas;
    
}
