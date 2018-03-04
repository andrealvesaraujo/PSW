/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetrj.psw.projetoalunosituacao;

/**
 * Classe de um Aluno que estuda no CEFET
 * @author Andre
 * @version 1
 * @since 04/03/2018
 */
public class Aluno {
   
    /**
     * Método da classe Aluno que verifica a situação final do aluno:Aprovado ou Reprovado  
     * @version 1
     * @since 04/03/2018
     * @param p1            Nota da primeira prova
     * @param trabalho      Nota do trabalho do periodo
     * @param projetosaula  Nota dos projetos feitos em sala
     * @param freq          Frequência do aluno na materia
     * @param pf            Nota da prova final
     * @return              String com o situação final do Aluno na materia(aprovado ou reprovado)
     */
    public String situacao(double p1,double trabalho,double projetosaula,double freq,double pf){
        double m1 = 0.7*((p1+trabalho)/2)+projetosaula* 0.3;
        String resultado;
        if(freq >= 0.75){
           if(m1>= 7) 
               resultado = "Aprovado";
           else if (m1 < 3) 
               resultado = "Reprovado";
           else{
               //Prova final
               if( ((pf + m1) / 2) >= 5)
                   resultado = "Aprovado";
               else
                   resultado = "Reprovado";
               
           }
       }else{
           resultado = "Reprovado";
       }
        
       return resultado;
    }
}
