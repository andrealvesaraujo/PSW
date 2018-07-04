/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.view.utils;

/**
 *
 * @author Andre
 */
public class Relatorio {
    
    private String nomeDepartamento;
    private int contratados;
    private int demitidos;
    
    public Relatorio(){
        
    }
    public Relatorio(String nome,int c,int d){
        this.nomeDepartamento=nome;
        this.contratados=c;
        this.demitidos=d;
    }

    public void incrementarContratados(){
        this.contratados++;
    }
    public void incrementarDemitidos(){
        this.demitidos++;
    }    
    /**
     * @return the nomeColaborador
     */
    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    /**
     * @param nomeColaborador the nomeColaborador to set
     */
    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    /**
     * @return the contratados
     */
    public int getContratados() {
        return contratados;
    }

    
    /**
     * @return the demitidos
     */
    public int getDemitidos() {
        return demitidos;
    }

    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Relatorio){
            Relatorio r = (Relatorio) obj;
            if(this.nomeDepartamento.equals(r.nomeDepartamento)){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.nomeDepartamento +" "+ this.contratados +" "+this.demitidos;
    }
    
}
