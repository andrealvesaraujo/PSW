/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.tabelaartistasp1;

/**
 * 
 * @author Andre
 */
public class Artista {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    
    private static int cont=0;
    private int id;
    private String nome;
    private String banda;
    private int anos;
    private String estilo;
    
    public Artista(){
      id=++cont;
      
    } 
    public Artista(int id){
        this.id=id;
    }
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
     * @return the banda
     */
    public String getBanda() {
        return banda;
    }

    /**
     * @param banda the banda to set
     */
    public void setBanda(String banda) {
        this.banda = banda;
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
     * @return the estilo
     */
    public String getEstilo() {
        return estilo;
    }

    /**
     * @param estilo the estilo to set
     */
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    //Usar select nesse

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof  Artista){
            if(((Artista) obj).id == this.id){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
}
