/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hellomaven;

import org.apache.log4j.Logger;//log4j-1.2 12.jar não é necessario baixar. 
//O documento do log4j.properties esta na pasta resources que esta no Outro Codigos-fonte
/**
 *
 * @author Andre
 */
public class HelloMaven1 {
    //Para adicionar o plugin do Jacoco de cobertura de testes vai em ferramentas-->Plugins-Disponiveis
    public String helloMavenMsg(String maven){
        /*Depende do log4j.properties que no caso abaixo precisa do lvl INFO*/
        Logger lg = Logger.getLogger(HelloMaven1.class);
        lg.info("Chamou helloMavenMsg com parametro maven = " + maven);
        
        
        /*Rodar teste unitario*/
        
        if(maven.equals("true"))
            return "Hello Maven";
        else if(maven.equals("false"))
            return "Hello";
        else{
            //Lvl do log.properties tem que ser error
            /*try{
                throw new Exception("Parametro invalido no metodo helloMavenMsg.Parametro = " + maven);
            }catch(Exception e){
                lg.error("Erro de execução:",e);
            
            }*/
            /*Para mostrar a coloração verde e vermelho de cobertura de teste vai na aplicação Cobertura de codigo->Mostrar relatorio */
            return "Erro";
            
        }    
    }
}
