/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.simuladop1;

/**
 * 
 * @author Andre
 */
public class Carro {

    private static int cont=0;
    private int id;
    private String marca;
    private String modelo;
    private int anos;
    private String cor;
    
    public Carro(){
      id=++cont;
      
    } 
    public Carro(int id){
        this.id=id;
    }
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the anos
     */
    public int getAnos() {
        return anos;
    }

    /**
     * @param anos the anos to set
     */
    public void setAnos(int anos) {
        this.anos = anos;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    
    
  
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Carro){
            if(((Carro) obj).id == this.id){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
}
