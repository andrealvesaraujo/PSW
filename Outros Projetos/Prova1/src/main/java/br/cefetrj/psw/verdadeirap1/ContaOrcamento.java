/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.verdadeirap1;

import java.util.ArrayList;

/**
 * Classe java da ContaOrcamento
 * 
 * @author Andre
 */
public class ContaOrcamento extends Conta{

   
    
   private float orcado;
   private float realizado;
   private float comprometido;
   private Orcamento orc;
   private ArrayList<ContaOrcamento> suborcamento ;
   
    /**
     * @param orcado the orcado to set
     */
    public void setOrcado(float orcado) {
        this.orcado = orcado;
    }

    /**
     * @param realizado the realizado to set
     */
    public void setRealizado(float realizado) {
        this.realizado = realizado;
    }

    /**
     * @param comprometido the comprometido to set
     */
    public void setComprometido(float comprometido) {
        this.comprometido = comprometido;
    }

   /**
    * 
    * @return o valor disponivel 
    */
    
   public float getValorDisponivel(){
       if(comprometido < orcado){
           return orcado-comprometido;
       }else{     
           return 0;
       }    
       
       
   }
   /**
    * 
    * @return o valor realizado
    */
   public float getValorRealizado(){
       
       return realizado;
   }
   /**
    * 
    * @return o valor comprometido 
    */
   public float getValorComprometido(){
       
       return comprometido;
   }
   /**
    * 
    * @return o valor orcado 
    */
   public float getValorOrcado(){
       
       return orcado;
   }
    
   @Override
    public String toString() {
        return this.getCodigo()+" "+this.getNome()+" "+this.getValorOrcado()+" "+this.getValorRealizado()+" "+this.getValorComprometido() +" " +this.getValorDisponivel(); 
    }
}
