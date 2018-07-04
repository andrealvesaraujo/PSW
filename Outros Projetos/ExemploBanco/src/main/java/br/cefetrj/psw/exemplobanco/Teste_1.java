package br.cefetrj.psw.exemplobanco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Andre
 */
public class Teste_1 {
    public static void main(String args[]){
        
        /*Pessoa p = new Pessoa();
    
           p.setNome("andasdasre");
           p.setTelefone("2222");*/
        EntityManagerFactory factory =
        Persistence.createEntityManagerFactory("br.cefetrj.psw_ExemploBanco_jar_1.0-SNAPSHOTPU");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        //Insere uma pessoa
        //manager.persist(p);
        /*Pessoa p = manager.find(Pessoa.class, 6L);
        manager.remove(p);*/
        
        /*Pessoa p = manager.find(Pessoa.class, 5L);
        p.setNome("Jose");
        manager.merge(p);*/
        
        /*List<Pessoa> lista = (List<Pessoa>)manager.createQuery("select p from Pessoa as p").getResultList();
        for(Pessoa pessoa : lista){
            System.out.println(pessoa.getNome());
        }*/
        
        Query query = manager.createQuery("select p from Pessoa as p where p.nome = :paramNome");
        query.setParameter("paramNome", "Jose");
        List<Pessoa> lista = query.getResultList();
        for(Pessoa pe : lista){
            System.out.println("ID:: "+pe.getId());
        }
        
        
        manager.getTransaction().commit(); 
        
        
        manager.close();
        factory.close();
    }    
}
